package hu.unideb.inf.fordprog.model;

import java.util.ArrayList;
import java.util.List;

public final class Database {

	private static final List<DatabaseTable> tables;
	static {
		tables = new ArrayList<>();
	}

	public static List<DatabaseTable> getTables() {
		return tables;
	}

	public static DatabaseTable getTableByName(String name) {
		return tables.stream().filter((DatabaseTable t) -> {
			return t.getName().equals(name);
		}).findFirst().orElse(null);
	}

	public static void addTable(DatabaseTable t){
		tables.add(t);
	}

}
