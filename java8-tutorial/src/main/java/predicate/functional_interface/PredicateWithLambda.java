package predicate.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWithLambda {
	public static void main(String[] args) {
		//---Write a function to check integer is even or not
		Predicate<Integer> p=i->i%2==0;
		System.out.println(p.test(8));
		
		List<Integer> numbers=Arrays.asList(2,3,5,7,9,8);
		//Write a function to check all item of above list and print even,odd
		List<Boolean> list = numbers.stream().map(i->i%2==0).toList();
		System.out.println(list);
		//              (Q)   In the above list print only even number
		numbers.stream().filter(i->i%2==0).forEach(n->System.out.println(n));
		
	}
}

//Note: filter() and map() returns a new collection. and forEach() does not return anything