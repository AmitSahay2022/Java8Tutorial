package homework3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_Employee_List {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAO();
		List<Employee> list = dao.getAllEmployees();
		
		//Here we are Sorting Employee object based on name
		
		list.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.forEach(emp -> System.out.println(emp.getName()));
System.out.println("----------------------------------");
		//Sorting Employee based on Salary
		Collections.sort(list,new MySorting());
		list.stream().forEach(e->System.out.println(e));
	}
}
//------------------Traditional Way---------------------------------
class MySorting implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (int) (e1.getSalary()-e2.getSalary()); //Sort employee based on salary
	}
}
