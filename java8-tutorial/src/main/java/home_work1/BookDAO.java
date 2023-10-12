package home_work1;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
   public List<Book> getBooks(){
	   List<Book> books=new ArrayList();
	   books.add(new Book(101, "Core Java", 1342));
	   books.add(new Book(102, "Spring 6.X", 342));
	   books.add(new Book(104, "Microservice", 438));
	   books.add(new Book(106, "Advance Java", 210));
	   books.add(new Book(108, "Git && GitHub", 10));
	   books.add(new Book(109, "Docker", 8));
	   return books;
   }
}
