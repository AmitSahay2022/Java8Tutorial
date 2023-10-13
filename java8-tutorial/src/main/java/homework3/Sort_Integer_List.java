package homework3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//Note: Collections class has many utility methods
public class Sort_Integer_List {
	public static void main(String[] args) {
       List<Integer> numbers=Arrays.asList(10,5,8,3,7,12);
       System.out.println("Before Sorting: "+numbers);
       Collections.sort(numbers);
       System.out.println("After Sorting in assending order: "+numbers);
       Collections.reverse(numbers);
       System.out.println("Sorting in desending order: "+numbers);
       //-------------------------------------------------------------------------------------
       //(Q) print above list using stream and for each ?
       numbers.stream().forEach(n->System.out.print(n+" "));
       
       System.out.println();
       
    // (Q) Print above list using stream foreach and method reference
       numbers.stream().forEach(System.out::print);
	}
}
