package howToSortAMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);

		// Convert this map object into set
		Set<Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		// Convert it into list
		List<Entry<String, Integer>> list = new ArrayList(set);
		System.out.println(list);
		// now sort it based on key ?
		Collections.sort(list, (e1,e2)->e1.getKey().compareTo(e2.getKey()));
		System.out.println("List After Sorting: "+list);
		
		//Use Stream API to Sort  now sort it based on value ?
		
		list.stream().sorted(Map.Entry.comparingByValue()).forEach(e->System.out.print(e+" "));
	}

}
