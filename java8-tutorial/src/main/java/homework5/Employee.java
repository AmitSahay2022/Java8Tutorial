package homework5;

public class Employee {
	private int id;
	private String name;
	private String grade;
	private double salary;

	public Employee(int id, String name, String grade, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGrade() {
		return grade;
	}

	public double getSalary() {
		return salary;
	}

}
