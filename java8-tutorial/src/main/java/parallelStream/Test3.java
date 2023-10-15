package parallelStream;

import java.util.List;

import homework5.Employee;

public class Test3 {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeDAO.getAllEmployees();
		
		//(Q) Find Average salary of employees using normal Stream ?
		
		long start=System.currentTimeMillis();
        double averageSal = employees
        		                .stream()
        		                .map(e->e.getSalary())
        		                .mapToDouble(i->i)
        		                .average()
        		                .getAsDouble();
        System.out.println("Average Salary= "+averageSal);
        long end=System.currentTimeMillis();
        System.out.println("Time taken in normal Stream: "+(end-start));
        System.out.println("-----------------------------");
        
        //(Q) Find Average Salary of employees using parallel stream ?
        
        start=System.currentTimeMillis();
        double avgSal = employees
        		            .parallelStream()
        		            .map(e->e.getSalary())
        		            .mapToDouble(d->d)
        		            .average()
        		            .getAsDouble();
        System.out.println("Avg Sal= "+avgSal);
        end=System.currentTimeMillis();
        System.out.println("Time taken by Parallel Stream: "+(end-start));
	}

}
