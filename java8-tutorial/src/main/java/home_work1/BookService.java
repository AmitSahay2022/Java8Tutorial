package home_work1;

import java.util.Comparator;
import java.util.List;

public class BookService {
   public List<Book> getSortedBasedonName(){
	   BookDAO dao=new BookDAO();
	   List<Book> books = dao.getBooks();
	   
	   books.sort(new SortBooksByName());
	   return books;
   }
   
}
//------------Traditional Approach----------------------------
class SortBooksByName implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getName().compareTo(b2.getName());
	}
}
