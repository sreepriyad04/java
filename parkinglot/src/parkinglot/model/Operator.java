package parkinglot.model;

public class Operator {
	private long id;
	private String employeeId;
	private String name;
	
	public Operator(long id, String employeeId, String name) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
