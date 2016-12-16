package hu.unideb.inf.fordprog.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import hu.unideb.inf.fordprog.interpreter.DatabaseInterpreter;
import hu.unideb.inf.fordprog.model.Database;
import hu.unideb.inf.fordprog.model.DatabaseTable;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnDescriptor;
import hu.unideb.inf.fordprog.model.DatabaseTableColumnType;

public class DatabaseCreateTableTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testCreateTable() {
        DatabaseInterpreter.interpret("create table test {id number, name varchar, dateOfBirth date};");

        List<DatabaseTable> tables = Database.getTables();
        DatabaseTable databaseTable = tables.get(0);
        String tableName = databaseTable.getName();
        System.out.println(tables);
        Assert.assertEquals("test", tableName);

        List<DatabaseTableColumnDescriptor> columns = databaseTable.getColumns();

        DatabaseTableColumnDescriptor id = columns.get(0);
        Assert.assertEquals("id", id.getColumnName());
        Assert.assertEquals(DatabaseTableColumnType.NUMBER, id.getType());

        DatabaseTableColumnDescriptor name = columns.get(1);
        Assert.assertEquals("name", name.getColumnName());
        Assert.assertEquals(DatabaseTableColumnType.VARCHAR, name.getType());

        DatabaseTableColumnDescriptor date = columns.get(2);
        Assert.assertEquals("dateOfBirth", date.getColumnName());
        Assert.assertEquals(DatabaseTableColumnType.DATE, date.getType());
    }

    @Test
    public void testInsertInto() {
        DatabaseInterpreter.interpret("insert into test (id,name) values (1,'nandi');");
    }

}
