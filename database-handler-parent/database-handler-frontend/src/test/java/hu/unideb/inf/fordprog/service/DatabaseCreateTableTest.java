package hu.unideb.inf.fordprog.service;

import java.util.List;

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
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;
import hu.unideb.inf.fordprog.service.display.DisplayService;

public class DatabaseCreateTableTest {

    private static final String DATE_OF_BIRTH = "dateOfBirth";
    private static final String NAME = "name";
    private static final String ID = "id";
    private static final String TEST_TABLE_NAME = "test";

    private DisplayService displayService = new DisplayService();

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
        DatabaseData firstId = new DatabaseData("id", DatabaseTableColumnType.NUMBER, "1");
        DatabaseData firstName = new DatabaseData("name", DatabaseTableColumnType.VARCHAR, "Jani");
        DatabaseData firstDate = new DatabaseData("dateOfBirth", DatabaseTableColumnType.DATE, "1995-10-20");
        // DatabaseRecord firstRecord = new
        // DatabaseRecord(Arrays.asList(firstId, firstName, firstDate));
        DatabaseInterpreter.interpret("insert into test (id,full_name) values (2,'Lora');");
        DatabaseInterpreter.interpret("select * from test;");
    }

    // FOR FUN
    @Test
    public void testInsertUlyssysTeam() {
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
        DatabaseInterpreter.interpret("select experience,feljeszto_neve,dogyness,id,fame from ulyssys;");
    }

    @Test
    public void testSelectSpecifiedColumns() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,full_name,dateOfBirth) values (1,'Jani',1995-10-20);");
        DatabaseInterpreter.interpret("insert into test (id,full_name) values (2,'Lora');");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (3,'Nandor',325.5);");
        DatabaseInterpreter.interpret("select payment,full_name,id from test;");
    }

    @Test
    public void testSelectWithWhereClause() {
        DatabaseInterpreter
                .interpret("create table test {id number, full_name varchar, dateOfBirth date, payment number};");
        DatabaseInterpreter.interpret("insert into test (id,full_name,dateOfBirth) values (1,'Jani',1995-10-20);");
        DatabaseInterpreter.interpret("insert into test (id,full_name) values (2,'Lora');");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (3,'Nandor',325.5);");
        DatabaseInterpreter.interpret("insert into test (id,full_name,payment) values (4,'Nolbi',10);");
        DatabaseInterpreter.interpret("select payment,full_name,id from test where payment = 10;");
        Assert.assertEquals(1, DatabaseSelectCache.getDatabaseCache().getSelectRecords().size());
    }

}
