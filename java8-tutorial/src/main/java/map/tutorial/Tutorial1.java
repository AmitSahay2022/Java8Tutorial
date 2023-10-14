package map.tutorial;

import java.util.Arrays;
import java.util.List;

public class Tutorial1 {

	public static void main(String[] args) {
		List<String> names=Arrays.asList("a","b","c","d","e");
		
		//Make all letters in upper case
        names.stream().map(n->n.toUpperCase()).toList().forEach(e->System.out.print(e+" "));
        
        
	}

}
