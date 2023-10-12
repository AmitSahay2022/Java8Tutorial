package streamAPI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Tutorial1 {
	private List<String> names=Arrays.asList("John","Cena","Brock","Lesner","Goldburg");	
	private Map<Integer, String> map=new HashMap<>();
	
	{
		map.put(1, "Amit Kumar");
		map.put(2, "Sunny Leone");
		map.put(3, "Katrina kaif");
		map.put(4, "Leah Gotti");
	}
	
	//-------------print above list using stream() and forEach()-------
	public void taks1() {
		names.stream().forEach(n->System.out.println(n+" "));
	}
	
	//------iterate map objects
	public void task2() {		
		map.forEach((i,name)->System.out.print(i+" : "+name+" "));
	}
	
	public void task3() {
		Consumer<String> consumer=n->System.out.print(n);
		names.stream().forEach(consumer);
	}
	public void task4() {
		BiConsumer<Integer, String> bc=(i,n)->System.out.println(i+"@ "+n);
		map.forEach(bc);
	}
	
	public static void main(String[] args) {
        Tutorial1 ob=new Tutorial1();        
        ob.taks1();
        System.out.println();
        ob.task2();
        System.out.println();
        ob.task3();
        System.out.println();
        ob.task4();
	}
}
