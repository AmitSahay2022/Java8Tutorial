package home_work1;

import java.util.List;

public class Test {
	public static void main(String[] args) {
		// ----------Books without sorting----------------
		BookDAO bookDAO = new BookDAO();
		List<Book> books = bookDAO.getBooks();
		System.out.println(books);
		//------Using Service class to sort books based on names---------
		BookService service = new BookService();
		List<Book> sortedBasedonName = service.getSortedBasedonName();
		System.out.println(sortedBasedonName);
		
		//-----Using service class 2----
		BookService2 service2=new BookService2();
		service2.getBooksInSortedOrder();
	}
}
