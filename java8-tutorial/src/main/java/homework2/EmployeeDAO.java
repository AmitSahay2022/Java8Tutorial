package homework2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
  public List<Employee> getAllEmployees(){
	  List<Employee> employees=new ArrayList<>();
	  employees.add(new Employee(101, "Amit kumar", "CSE", 68000));
	  employees.add(new Employee(102, "Kartina Kaif", "Movie", 34009));
	  employees.add(new Employee(103, "Sunny Leone", "Adult", 80000));
	  return employees;
  }
}
