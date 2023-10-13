package homework3;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private String school;
	
	@Override
	public int compareTo(Student s) {
		
		return this.getName().compareToIgnoreCase(s.getName());
	}

	public Student(int id, String name, String school) {
		super();
		this.id = id;
		this.name = name;
		this.school = school;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " : " + name + " : " + school;
	}
}
