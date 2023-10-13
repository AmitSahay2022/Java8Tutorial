package streamAPI.filter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterTutorial {

	private List<String> names=Arrays.asList("Amit","Katrina","Brock","Sunny leone","Amanda Cerny","Batista");
	
	//(Q) Write a function which will print only names which start with B
	                 
	public void printNamesStartWith(String n) {
		     //Traditional old way
		for (String name : names) {
			if(name.startsWith(n)) {
				System.out.println(name);
			}
		}
		System.out.println("-------------------------------------------------------");
		//Since 1.8 
		names.stream().filter(na->na.startsWith(n)).forEach(nn->System.out.print(nn+" "));
		
	}
	
	//(Q) Create a map like 1:"Amit", 2:"Sunny" and print only who has even key
	
	public void practice1() {
		System.out.println();
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Amit");
		map.put(2, "Sunny Leone");
		map.put(3, "Amanda Cerny");
		
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(n->System.out.println(n));
	}
	
	public static void main(String[] args) {
		FilterTutorial tutorial=new FilterTutorial();
		tutorial.printNamesStartWith("B");
		tutorial.practice1();
	}
}
