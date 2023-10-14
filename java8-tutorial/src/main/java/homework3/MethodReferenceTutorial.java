package homework3;

import java.util.List;

public class MethodReferenceTutorial {
	
	
	public static void main(String[] args) {
       EmployeeDAO dao=new EmployeeDAO();
       List<Employee> employees = dao.getAllEmployees();
       
       //(Q)Create a new List which will contain only name of Employee ?
       List<String> listOfEmployeeNames = employees.stream().map(Employee::getName).toList(); //using method reference
       
       System.out.println(listOfEmployeeNames);
       
       //(Q)Create a new collection which will contain only department of employee
       List<String> listOfDepartment = employees.stream().map(e->e.getDepartmant()).toList();
       
       System.out.println(listOfDepartment);
	}
}

/*
  Collection.stream()   => getting object one by one from collection
      About Method reference
         (1) .map(Employee::getName)
         (2) .map(e->e.getName())
        Both are equal   
*/