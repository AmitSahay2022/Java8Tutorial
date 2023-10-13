package homework3;

public class Employee {
	private long id;
	private String name;
	private String departmant;
	private double salary;

	public Employee(long id, String name, String departmant, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.departmant = departmant;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartmant() {
		return departmant;
	}

	public double getSalary() {
		return salary;
	}
  
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +" : "+departmant+" : "+salary;
	}
}
