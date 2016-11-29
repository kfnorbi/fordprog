package hu.unideb.inf.fordprog.model;

public class DatabaseIdentifyerDescriptor extends DatabaseElement {

	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public DatabaseIdentifyerDescriptor(String value) {
		super();
		this.value = value;
	}

}
