package optionalTutorial;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CustomerDatabase {
	public static List<Customer> getCustomers() {
		return (Arrays.asList(new Customer(101, Optional.of("John"),Optional.of("john@gmail.com"), Arrays.asList("9472728287", "54678349")),
				new Customer(102, Optional.of("Smith"), Optional.of("smith@gmail.com"), Arrays.asList("7672728287", "89778349")),
				
				new Customer(103, Optional.of("Cena"), Optional.of("cena@gmail.com"), Arrays.asList("98762728287", "872378349")),
				new Customer(104, Optional.of("Roman"), Optional.of("roman@gmail.com"), Arrays.asList("24182728287", "00678349"))));
	}
}
