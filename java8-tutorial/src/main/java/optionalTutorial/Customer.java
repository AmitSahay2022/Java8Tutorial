package optionalTutorial;

import java.util.List;
import java.util.Optional;

public class Customer {
	private int id;
	private Optional<String> name;
	private Optional<String> email;
	private List<String> phoneNmubers;

	public Customer(int id, Optional<String> name, Optional<String> email, List<String> phoneNmubers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNmubers = phoneNmubers;
	}

	public int getId() {
		return id;
	}

	public Optional<String> getName() {
		return name;
	}

	public Optional<String> getEmail() {
		return email;
	}

	public List<String> getPhoneNmubers() {
		return phoneNmubers;
	}

}
