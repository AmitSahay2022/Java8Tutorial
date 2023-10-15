package optionalTutorial;

import java.util.List;
import java.util.Optional;

import homework4.Customer;
import homework4.Database;

public class Tutorial2 {
	
	public static Customer getCustomerByEmail(String email) {
		List<Customer> customers = Database.getCustomers();
		Optional<Customer> optional = customers.stream().filter(c->c.getEmail().equals(email)).findAny();
		return optional.orElse(new Customer(1,null,null,null));
	}

	public static void main(String[] args) {
		
        System.out.println(getCustomerByEmail("a")); 
        
        System.out.println(getCustomerByEmail("john@gmail.com"));
		
	}

}
