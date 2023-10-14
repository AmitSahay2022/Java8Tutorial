package optionalTutorial;

import java.util.List;





public class Tutorial1 {

	public static void main(String[] args) {
		List<Customer> customers = CustomerDatabase.getCustomers();
		
		customers.stream().map(c->c.getId()).forEach(n->System.out.println(n));
		
		customers.stream().map(c->c.getName().get().toUpperCase()).forEach(cus->System.out.println(cus));
		
		//Create a new list which contains all names in upper case
        
	}

}
