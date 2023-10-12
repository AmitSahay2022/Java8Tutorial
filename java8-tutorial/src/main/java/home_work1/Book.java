package home_work1;

public class Book {
	private long id;
	private String name;
	private int pages;

	public Book(long id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}

	public long getId() {
		return id;
	}	

	public String getName() {
		return name;
	}	

	public int getPages() {
		return pages;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}

	
    
}
