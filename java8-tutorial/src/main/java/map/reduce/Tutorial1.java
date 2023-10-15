package map.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// .reduce(startingPoint,binary-function)
public class Tutorial1 {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(2,4,6,8,10,11,15);
        Integer total = stream.reduce(0, (a,b)->a+b);
        System.out.println(total);
        
        //Example2: find the total? 
        List<Integer> numbers = Arrays.asList(5,12,15,43,23,67,1);
        int sum = numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum);
        
        //Example 3: find the Total
         Integer tSum = numbers.stream().reduce(Integer::sum).get();
        System.out.println(tSum);
        
        //Example 4: find max value ?
        Integer maxVal = numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x : y);
        System.out.println(maxVal);
        
        //Example 5: find min value?
        Integer minVal = numbers.stream().reduce(numbers.get(0),(a,b)-> a<b ? a : b);
        System.out.println(minVal);
        
        //Example 6: find max value ?
       Integer max = numbers.stream().reduce(Integer::max).get();
       System.out.println(max);
       
       //Example 7: find min value ?
       Integer min = numbers.stream().reduce(Integer::min).get();
       System.out.println(min);
	}

}
