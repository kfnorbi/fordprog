package hu.unideb.inf.fordprog.service;

import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.unideb.inf.fordprog.error.ArgumentNumberException;
import hu.unideb.inf.fordprog.error.ColumnDoesNotExistsException;
import hu.unideb.inf.fordprog.error.ColumnTypeException;
import hu.unideb.inf.fordprog.error.TableAlreadyExistsException;
import hu.unideb.inf.fordprog.error.TableDoesNotExistsException;
import hu.unideb.inf.fordprog.interpreter.DatabaseInterpreter;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseData;
import hu.unideb.inf.fordprog.model.DatabaseRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectCache;
import hu.unideb.inf.fordprog.model.DatabaseSelectRecord;
import hu.unideb.inf.fordprog.model.DatabaseSelectResult;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

public class DatabaseCreateTableTest {

    private static final String DATE_OF_BIRTH = "dateOfBirth";
    private static final String NAME = "name";
    private static final String ID = "id";
    private static final String TEST_TABLE_NAME = "test";

    private static final String[] names = { "'TestJohn'", "'TestAdam'", "'TestLora'", "'TestNolbi'", "'TestZsolt'",
            "'TestBarna'", "'TestTamas'", "'TestViktor'", "'TestFanny'", "'TestZoltan'", "'TestFerenc'" };

    @Before
    public void setUp() throws Exception {
        Database.clearDatabase();
        DatabaseSelectCache.resetCache();
    }

    @Test
    public void testCreateTable() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");

        List<DatabaseTable> tables = Database.getTables();
        DatabaseTable databaseTable = tables.get(0);
        String tableName = databaseTable.getName();
        Assert.assertEquals(TEST_TABLE_NAME, tableName);

        List<DatabaseTableColumnDescriptor> columns = databaseTable.getColumns();

        DatabaseTableColumnDescriptor id = columns.get(0);
        Assert.assertEquals(ID, id.getColumnName());
        Assert.assertEquals(DatabaseTableColumnType.NUMBER, id.getType());

        DatabaseTableColumnDescriptor name = columns.get(1);
        Assert.assertEquals(NAME, name.getColumnName());
        Assert.assertEquals(DatabaseTableColumnType.VARCHAR, name.getType());

        DatabaseTableColumnDescriptor date = columns.get(2);
        Assert.assertEquals(DATE_OF_BIRTH, date.getColumnName());
        Assert.assertEquals(DatabaseTableColumnType.DATE, date.getType());
    }

    @Test
    public void testGetTableColumnTypeByTableAndColumnName() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");
        Assert.assertEquals(DatabaseTableColumnType.NUMBER,
                Database.getTableColumnTypeByTableAndColumnName(TEST_TABLE_NAME, ID));
        Assert.assertEquals(DatabaseTableColumnType.VARCHAR,
                Database.getTableColumnTypeByTableAndColumnName(TEST_TABLE_NAME, NAME));
        Assert.assertEquals(DatabaseTableColumnType.DATE,
                Database.getTableColumnTypeByTableAndColumnName(TEST_TABLE_NAME, DATE_OF_BIRTH));
    }

    @Test(expected = TableAlreadyExistsException.class)
    public void testCreateTableTwiceShouldThrowException() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");
    }

    @Test
    public void testInsertInto() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,name,dateOfBirth) values (1,'Jani',1995-10-20);");
        DatabaseInterpreter.interpret("insert into test (id,name) values (2,'Lora');");
        DatabaseInterpreter.interpret("insert into test (id,name,payment) values (3,'Adam',325.5);");
        List<DatabaseRecord> dataFromTable = Database.getDataFromTable(TEST_TABLE_NAME);
        Assert.assertEquals(3, dataFromTable.size());
        DatabaseRecord databaseRecord = dataFromTable.get(0);
        Assert.assertEquals("Jani", databaseRecord.getDataByColumnName("name").getValue());
        Assert.assertEquals("1", databaseRecord.getDataByColumnName("id").getValue());
        Assert.assertEquals("1995-10-20", databaseRecord.getDataByColumnName("dateOfBirth").getValue());
    }

    @Test(expected = ColumnTypeException.class)
    public void testWrongColumnType() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");
        DatabaseInterpreter.interpret("insert into test (id,name,dateOfBirth) values ('number1','Nandi',1995-10-20);");
    }

    @Test(expected = ArgumentNumberException.class)
    public void testArgumentNumber() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");
        DatabaseInterpreter.interpret("insert into test (id,name) values (1,'Nandi',1995-10-20);");
    }

    @Test(expected = ColumnDoesNotExistsException.class)
    public void testColumnDoesNotExists() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");
        DatabaseInterpreter.interpret("insert into test (id,password) values (1,'password');");
    }

    @Test(expected = TableDoesNotExistsException.class)
    public void testInsertIntoTableWhichDoesNotExists() {
        DatabaseInterpreter.interpret("insert into test (id,password) values (1,'password');");
    }

    @Test
    public void testSelect() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");

        DatabaseInterpreter.interpret("insert into test (id,full_name,dateOfBirth) values (1,'Jani',1995-10-20);");
        DatabaseInterpreter.interpret("insert into test (id,full_name) values (2,'Lora');");
        DatabaseInterpreter.interpret("select * from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        DatabaseSelectRecord firstRow = databaseCache.getSelectRecords().get(0);
        Assert.assertTrue(firstRow.getData().contains(new DatabaseData("id", DatabaseTableColumnType.NUMBER, "1")));
        Assert.assertTrue(
                firstRow.getData().contains(new DatabaseData("full_name", DatabaseTableColumnType.VARCHAR, "Jani")));
        Assert.assertTrue(firstRow.getData()
                .contains(new DatabaseData("dateOfBirth", DatabaseTableColumnType.DATE, "1995-10-20")));

        DatabaseSelectRecord secondRow = databaseCache.getSelectRecords().get(1);
        Assert.assertTrue(secondRow.getData().contains(new DatabaseData("id", DatabaseTableColumnType.NUMBER, "2")));
        Assert.assertTrue(
                secondRow.getData().contains(new DatabaseData("full_name", DatabaseTableColumnType.VARCHAR, "Lora")));
    }

    // FOR FUN
    @Test
    public void testColumnOrderInSelect() {
        DatabaseInterpreter.interpret(
                "create table ulyssys {id number, feljeszto_neve varchar, dogyness number, fame number,experience number};");
        DatabaseInterpreter.interpret(
                "insert into ulyssys (id,feljeszto_neve,dogyness,fame,experience) values (1,'SzasziUr',100,66,50);");
        DatabaseInterpreter
                .interpret("insert into ulyssys (id,feljeszto_neve,dogyness,fame) values (2,'Mark',100,99);");
        DatabaseInterpreter
                .interpret("insert into ulyssys (id,feljeszto_neve,dogyness,fame) values (3,'RicsiFiu',0,100);");
        DatabaseInterpreter
                .interpret("insert into ulyssys (id,feljeszto_neve,dogyness,fame) values (4,'Viktor',0,1000);");
        DatabaseInterpreter
                .interpret("select experience,feljeszto_neve,dogyness,id,fame from ulyssys where dogyness != 100;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        Set<DatabaseTableColumnDescriptor> columns = databaseCache.getColumns();
        Set<DatabaseTableColumnDescriptor> sortedColumnSet = new TreeSet<>();
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(1, "experience", DatabaseTableColumnType.NUMBER));
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(2, "feljeszto_neve", DatabaseTableColumnType.VARCHAR));
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(3, "dogyness", DatabaseTableColumnType.NUMBER));
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(4, "id", DatabaseTableColumnType.NUMBER));
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(5, "fame", DatabaseTableColumnType.NUMBER));
        Assert.assertEquals(sortedColumnSet, columns);

    }

    @Test
    public void testSelectSpecifiedColumns() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,full_name,dateOfBirth) values (1,'Jani',1995-10-20);");
        DatabaseInterpreter.interpret("insert into test (id,full_name) values (2,'Lora');");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (3,'Nandor',325.5);");
        DatabaseInterpreter.interpret("select payment,full_name,id from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        Set<DatabaseTableColumnDescriptor> columns = databaseCache.getColumns();
        Set<DatabaseTableColumnDescriptor> sortedColumnSet = new TreeSet<>();
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(1, "payment", DatabaseTableColumnType.NUMBER));
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(2, "full_name", DatabaseTableColumnType.VARCHAR));
        sortedColumnSet.add(new DatabaseTableColumnDescriptor(3, "id", DatabaseTableColumnType.NUMBER));
        Assert.assertEquals(sortedColumnSet, columns);
    }

    @Test
    public void testSelectWithWhereClause() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,full_name,dateOfBirth) values (1,'Jani',1995-10-20);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (2,'Lora',210);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (3,'Nandor',325.5);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (4,'Nolbi',10);");
        DatabaseInterpreter.interpret("select payment,full_name,id from test where payment = 10;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        DatabaseSelectRecord row = databaseCache.getSelectRecords().get(0);
        Assert.assertTrue(row.getData().contains(new DatabaseData("id", DatabaseTableColumnType.NUMBER, "4")));
        Assert.assertTrue(
                row.getData().contains(new DatabaseData("full_name", DatabaseTableColumnType.VARCHAR, "Nolbi")));
        Assert.assertTrue(row.getData().contains(new DatabaseData("payment", DatabaseTableColumnType.NUMBER, "10")));

        DatabaseInterpreter.interpret("select payment,full_name,id from test where payment > 10;");
        databaseCache = DatabaseSelectCache.getDatabaseCache();
        Assert.assertEquals(2, DatabaseSelectCache.getDatabaseCache().getSelectRecords().size());
        row = databaseCache.getSelectRecords().get(0);
        Assert.assertTrue(row.getData().contains(new DatabaseData("id", DatabaseTableColumnType.NUMBER, "2")));
        Assert.assertTrue(
                row.getData().contains(new DatabaseData("full_name", DatabaseTableColumnType.VARCHAR, "Lora")));
        Assert.assertTrue(row.getData().contains(new DatabaseData("payment", DatabaseTableColumnType.NUMBER, "210")));

        row = databaseCache.getSelectRecords().get(1);
        Assert.assertTrue(row.getData().contains(new DatabaseData("id", DatabaseTableColumnType.NUMBER, "3")));
        Assert.assertTrue(
                row.getData().contains(new DatabaseData("full_name", DatabaseTableColumnType.VARCHAR, "Nandor")));
        Assert.assertTrue(row.getData().contains(new DatabaseData("payment", DatabaseTableColumnType.NUMBER, "325.5")));

    }

    @Test
    public void demo() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (1,'TestJohn',345.5);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (2,'TestAndrea',200.67);");
        DatabaseInterpreter
                .interpret("insert into test (id,full_name,dateOfBirth) values (3,'TestMichael',1975-09-12);");
        DatabaseInterpreter.interpret("select * from test;");
        DatabaseInterpreter.interpret("select payment,full_name,id from test;");
        DatabaseInterpreter.interpret("select payment,full_name from test where payment > 10;");
    }

    @Test
    public void testSumFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select sum(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        // 345.5+123+200.67 = 669.17
        Assert.assertEquals(Double.valueOf(669.17), Double.valueOf(databaseData.getValue()));
    }

    @Test
    public void testAvgFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select avg(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        // 345.5+123+200.67 = 669.17 / 3
        Assert.assertEquals(Double.valueOf(669.17 / 3), Double.valueOf(databaseData.getValue()));
    }

    @Test
    public void testMaxFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select max(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        Assert.assertEquals(Double.valueOf(345.5), Double.valueOf(databaseData.getValue()));
    }

    @Test
    public void testMinFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select min(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        Assert.assertEquals(Double.valueOf(123), Double.valueOf(databaseData.getValue()));
    }

    @Test
    public void testCountFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select count(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        Assert.assertEquals(Double.valueOf(3), Double.valueOf(databaseData.getValue()));
    }

    @Test
    public void testEquals() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select full_name from test where full_name = 'TestJohn';");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        Assert.assertEquals("TestJohn", databaseData.getValue());
    }

    @Test
    public void testNotEquals() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select full_name from test where full_name != 'TestJohn';");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecordFirst = selectRecords.get(0);
        List<DatabaseData> firstRow = databaseSelectRecordFirst.getData();
        DatabaseSelectRecord databaseSelectRecordSecord = selectRecords.get(1);
        List<DatabaseData> secondRow = databaseSelectRecordSecord.getData();
        Assert.assertEquals(2, selectRecords.size());
        Assert.assertEquals("TestAndrea", firstRow.get(0).getValue());
        Assert.assertEquals("TestMichael", secondRow.get(0).getValue());
    }

    @Test
    public void testGreaterThanEqualsInWhere() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select payment from test where payment >= 200.67;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        Assert.assertEquals(2, selectRecords.size());
    }

    @Test
    public void testLessThanEqualsInWhere() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select payment from test where payment <= 200.66;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        Assert.assertEquals(1, selectRecords.size());
    }

    @Test
    public void testLessThanInWhere() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select payment from test where payment < 345.5;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        Assert.assertEquals(2, selectRecords.size());
    }

    @Test(expected = ColumnTypeException.class)
    public void testLessThanWithVarcharInWhere() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select full_name from test where full_name < 345.5;");
    }

    @Test(expected = ColumnTypeException.class)
    public void testGreaterThanWithVarcharInWhere() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("select full_name from test where full_name > 345.5;");
    }

    @Test
    public void testFunctionWithEmptyTable() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("select count(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        Assert.assertTrue(selectRecords.isEmpty());
    }

    // @Test
    public void testBigData() {
        DatabaseInterpreter.interpret("create table test {id number, full_name varchar, payment number};");
        for (int i = 0; i < 10000; i++) {
            DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (" + i + ","
                    + names[i % (new Random().nextInt(names.length) + 1)] + "," + (new Random().nextInt(10000) + 10000)
                    + ");");
        }

        DatabaseInterpreter.interpret("select count(id) from test;");
        DatabaseInterpreter.interpret("select sum(payment) from test;");
        DatabaseInterpreter.interpret("select avg(payment) from test;");
        DatabaseInterpreter.interpret("select min(payment) from test;");
        DatabaseInterpreter.interpret("select max(payment) from test;");

    }

    @Test
    public void testDistinct() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (4,'TestAndrea',200.67);");
        DatabaseInterpreter.interpret("select distinct payment from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        Assert.assertEquals(3, selectRecords.size());
    }

    @Test
    public void testDistinctWithFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (4,'TestAndrea',200.67);");
        DatabaseInterpreter.interpret("select distinct sum(payment) from test;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        // 345.5+123+200.67 = 669.17
        Assert.assertEquals(Double.valueOf(669.17), Double.valueOf(databaseData.getValue()));
    }

    @Test
    public void testDistinctWithWhereAndFunction() {
        createTableAndInsertDataForFunctionTest();
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (4,'TestAndrea',200.67);");
        DatabaseInterpreter.interpret("select distinct sum(payment) from test where payment > 200.66;");
        DatabaseSelectResult databaseCache = DatabaseSelectCache.getDatabaseCache();
        List<DatabaseSelectRecord> selectRecords = databaseCache.getSelectRecords();
        DatabaseSelectRecord databaseSelectRecord = selectRecords.get(0);
        List<DatabaseData> data = databaseSelectRecord.getData();
        DatabaseData databaseData = data.get(0);
        Assert.assertEquals(1, selectRecords.size());
        Assert.assertEquals(1, data.size());
        // 345.5+200.67 = 546.17
        Assert.assertEquals(Double.valueOf(546.17), Double.valueOf(databaseData.getValue()));
    }

    private void createTableAndInsertDataForFunctionTest() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (1,'TestJohn',345.5);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (2,'TestAndrea',200.67);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (3,'TestMichael',123);");
    }

}
