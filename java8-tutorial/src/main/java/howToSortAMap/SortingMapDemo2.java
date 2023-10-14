package howToSortAMap;

import java.util.Map;
import java.util.TreeMap;

import homework3.Employee;

/*
 * Storing Data inside TreeMap means data will be sorted based on key hence key object must implement comparable
 *            or else we have to explicitly pass comparator
 */
public class SortingMapDemo2 {

	public static void main(String[] args) {
		Map<String,Integer> map=new TreeMap<>(); 
		map.put("Brock", 100);
		map.put("Apple", 20);
		map.put("Orange", 10);
		map.put("Cat", 30);
		System.out.println(map);
		
		Map<Employee, Integer> employeeMap=new TreeMap<>((e1,e2)->e1.getDepartmant().compareTo(e2.getDepartmant()));
		employeeMap.put(new Employee(1, "Amit", "CSE", 800000), 80);
		employeeMap.put(new Employee(2, "Sunny Leone", "Porn", 600000), 60);
		employeeMap.put(new Employee(3, "Katrina Kaif", "Movie", 500000), 50);
		employeeMap.put(new Employee(4, "Leah Gotti", "Adult", 40000), 4);
		employeeMap.put(new Employee(5, "Amanda Cerny", "Adult", 50000), 5);
		System.out.println(employeeMap);
	}

}
//{key=value} here key is Employee object and value = int