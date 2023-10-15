package homework5;

import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {
  public static List<Employee> getEmployees(){
	  return Arrays.asList(
			  new Employee(101, "Amit kumar", "A", 600000),
			  new Employee(102, "Brock lesner", "B", 480000),
			  new Employee(103, "Tom cruz", "A", 650000),
			  new Employee(104, "Donald trumph", "A", 620000),
			  new Employee(105, "John cena", "C", 380000)
			  );
  }
}
