package map.reduce;

import java.util.Arrays;
import java.util.List;

public class Tutorial2 {

	public static void main(String[] args) {
		List<String> subjects = Arrays.asList("Core Java","Spring Boot 3.x","Hibernet","Git and Github");

		//(Q) find the longest word?
		String longest = subjects
				            .stream()
				            .reduce((word1,word2)-> word1.length()>word2.length() ? word1 : word2).get();
		System.out.println(longest);
		
	}

}
