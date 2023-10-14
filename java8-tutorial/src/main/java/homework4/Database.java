package homework4;

import java.util.Arrays;
import java.util.List;

public class Database {
   public static List<Customer> getCustomers(){
	   return (Arrays.asList(new Customer(101, "John", "john@gmail.com", Arrays.asList("9472728287","54678349")),
			   new Customer(101, "Smith", "smith@gmail.com", Arrays.asList("7672728287","89778349")),
			   new Customer(101, "Cena", "cena@gmail.com", Arrays.asList("98762728287","872378349")),
			   new Customer(101, "Roman", "roman@gmail.com", Arrays.asList("24182728287","00678349"))
			   ));
   }
}
