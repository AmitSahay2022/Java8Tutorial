package homework4;

import java.util.List;
/*
 * map() can be used if one field has only one value. Ex: here Customer has only one name and one email
 *      
 *      but Customer has List<String> as phoneNumber
 */
public class StreamAndMapMethodTutorial1 {

	public static void main(String[] args) {
		List<Customer> customers = Database.getCustomers();
		
		//Create a List with all Customer names
		List<String> listOfCustomeNames = customers
				                               .stream()
				                               .map(c->c.getName())
				                               .toList();
        System.out.println(listOfCustomeNames);
        
        //Create a List of all Customer email
        List<String> listOfEmails = customers
        		                        .stream()
        		                        .map(Customer::getEmail)
        		                        .toList();
        System.out.println(listOfEmails);
        
        //Create a List of All phoneNumber of Customers
        List<List<String>> listOfPhoneNumbers = customers
        		                                   .stream()
        		                                   .map(c->c.getPhoneNmubers())
        		                                   .toList();
        System.out.println(listOfPhoneNumbers); //But here we get List<List>
        
        //Hence use flatMap()
        List<String> listOfNumbers = customers
        		                         .stream()
        		                         .flatMap(c->c.getPhoneNmubers()
        		                         .stream())
        		                         .toList();
        System.out.println(listOfNumbers);
	}

}
