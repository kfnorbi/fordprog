package hu.unideb.inf.fordprog.library;

public class State {

	private Integer id;

	private boolean rejector = false;;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isRejector() {
		return rejector;
	}

	public void setRejector(boolean rejector) {
		this.rejector = rejector;
	}

}
