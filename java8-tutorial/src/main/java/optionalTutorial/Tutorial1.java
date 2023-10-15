package optionalTutorial;

import java.util.Arrays;
import java.util.Optional;

import homework4.Customer;

public class Tutorial1 {

	public static void main(String[] args) {
		Customer customer=new Customer(1, null, "kane@gmail.com", Arrays.asList("455","323"));
		
		//(Q) How to create optional object?
		// There are 3 static method (1)Optional.empty() (2)Optional.of(Value) (3)Optional.ofNullable(Value)
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		//.ofNullable(Value) -->does not throws exception. if value is null then it returns empty Optional object
	    Optional<String> email = Optional.ofNullable(customer.getEmail());
	    System.out.println(email);
	    Optional<String> name = Optional.ofNullable(customer.getName());
	    System.out.println(name);
	    
	    //.of(Value) -->Throws Exception if Value is null
	    try {
		Optional<String> optionalName = Optional.of(customer.getName());
		System.out.println(optionalName);
	    }catch(NullPointerException e) {System.out.println("Name is null");}
        
		//(Q) How to get Value from an optional
		
		String string = email.get();
		System.out.println(string);
		
		Optional<String> custName = Optional.ofNullable(customer.getName());
		String cName = custName.orElse("Name is not Found");
		System.out.println(cName);
		
		//(Q) Get the email and name from customer object and make it Upper case
		Optional<String> emailOptional = Optional.ofNullable(customer.getEmail());
		if(emailOptional.isPresent()) {
			String string2 = emailOptional.get();
		    System.out.println(string2.toUpperCase());
		}
		Optional<String> optionalName = Optional.ofNullable(customer.getName());
		if(optionalName.isPresent()) {
			String string2 = optionalName.get();
			System.out.println(string2.toUpperCase());
		}
	}

}
