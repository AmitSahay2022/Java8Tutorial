package homework2;

import java.util.List;

public class EmployeeService {
   public void evaluateTaxPayers(){
	   EmployeeDAO dao=new EmployeeDAO();
	   List<Employee> allEmployees = dao.getAllEmployees();
	   allEmployees.stream().filter(e->e.getSalary()>50000).forEach(emp->System.out.println(emp.getName()+" You should pay tax"));
	   
   }
}
