package home_work1;

import java.util.Comparator;
import java.util.List;

public class BookService2 {
   public void getBooksInSortedOrder(){
	   BookDAO dao=new BookDAO();
	   List<Book> books = dao.getBooks();
	   
	 //--------------Java 8 Approach------------------
	   
	   Comparator<Book> comparator=(b1,b2)->b2.getName().compareTo(b1.getName());
	   
	   books.sort(comparator);
	   System.out.println(books);
   }
}
