package predicate.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//--------Old Traditional approach to provide implementation for a method------------------------------
public class PredicateDemo implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		// Check even/odd
		if (t % 2 == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,5,6,8,9,11,14,15);
		
		list.stream().filter(new PredicateDemo()).forEach(i->System.out.print(i+" "));
		System.out.println();
		//Write method to print odd numbers from above list?
		
		list.stream().filter(i->(i%2) !=0).forEach(e->System.out.print(e+" ")); //Just one line code and job done
		
		PredicateDemo pd=new PredicateDemo();
		System.out.println();
        System.out.println(pd.test(5)); //false
	}
}
/* 
 * What is predicate? 
 *     it is a Functional Interface which takes one T type as parameter and return boolean value
 * filter(predicate)  -> 
 */
  