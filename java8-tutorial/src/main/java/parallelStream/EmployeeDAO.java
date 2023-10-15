package parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import homework5.Employee;

public class EmployeeDAO {
	//Create 1000 Employee Object and return it
   public static List<Employee> getAllEmployees(){
	   List<Employee> employees=new ArrayList<>();
	   for(int i=0;i<1000;i++) {
		   employees.add(new Employee(i, "employee "+i, "C", Double.valueOf(new Random().nextDouble(1000*100))));
	   }
	   return employees;
   }
}
