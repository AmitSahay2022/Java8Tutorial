package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * What we learned?
 *     To sort a List(Collection), we have Collections.sort(list)
 *                any class which implements Comparable(I) can be sorted like this
 *     if we want our own sorting logic then we can use Comparator(I)   
 */


public class SortStudentList {
	public static void main(String[] args) {
       List<Student> students=new ArrayList<>();
       students.add(new Student(1, "apple", "Frutes"));
       students.add(new Student(2, "Orange", "Frout"));
       students.add(new Student(3, "Banana", "Phal"));
       students.add(new Student(4, "Aaam", "Phal"));
       
       System.out.println("Before Sorting: "+students);
       Collections.sort(students);
       System.out.println("After Natural Sorting: "+students);
       //----------------------------------------------------------------
       //(Q) Sort these objects based on id, descending order
       
       Collections.sort(students,(s1,s2)->s2.getId()-s1.getId());
       System.out.println("After Customize sorting: "+students);
	}
}
