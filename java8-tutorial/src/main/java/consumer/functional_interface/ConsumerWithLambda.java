package consumer.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithLambda {
	public static void main(String[] args) {
       Consumer<Integer> con=i->System.out.println("Printing: "+i);
       con.accept(20);
       //----------------------Task 1: Create a list of Integer and print squire of each of it's object--------
       List<Integer> list=Arrays.asList(2,4,6,4,5,8);
       Consumer<Integer> c=i->System.out.println(i+" * "+i+ " : "+i*i);
       list.stream().forEach(c);
       
       //-------Task 2: Create a List of Integer and print with +5 added in each item
       List<Integer> num=Arrays.asList(2,3,5,7,8,9);
       num.stream().forEach(i->System.out.println(i+" +5 ="+(i+5)));
	}
}
 /*
  If we have to write a method which will accept one argument and do some operation
      but not return anything then we can use Consumer (I)


*/