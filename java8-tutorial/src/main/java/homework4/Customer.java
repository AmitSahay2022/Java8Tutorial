package homework4;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private List<String> phoneNmubers;

	public Customer(int id, String name, String email, List<String> phoneNmubers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNmubers = phoneNmubers;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<String> getPhoneNmubers() {
		return phoneNmubers;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" : "+name+" : "+email+" : "+phoneNmubers;
	}
}
