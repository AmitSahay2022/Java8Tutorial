package homework5;

import java.util.List;

public class FindAverageSalary {

	public static void main(String[] args) {
		// Example 1: Get all employee with grade A then find his average Salary?
		List<Employee> employees = EmployeeDatabase.getEmployees();
		
        List<Employee> listOfAGradeEmp = employees.stream().filter(e->e.getGrade().equalsIgnoreCase("a")).toList();
        Double totalSalary = listOfAGradeEmp.stream().map(Employee::getSalary).reduce(Double::sum).get();
        System.out.println("Average Salary = "+totalSalary/listOfAGradeEmp.size());
        
        //Example 2:  Get all employee with grade A then find his average Salary?
        double asDouble = employees
            .stream()
            .filter(e->e.getGrade().equalsIgnoreCase("a"))
            .map(emp->emp.getSalary())
            .mapToDouble(i->i).average().getAsDouble();
        System.out.println(asDouble);
	}

}
