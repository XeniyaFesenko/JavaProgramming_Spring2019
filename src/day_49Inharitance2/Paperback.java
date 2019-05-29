package day_49Inharitance2;

public class Paperback extends Book {

	
	private int pages;

	
	public String toString() {
	//title, author, price, type, pages.
	
	return getTitle() + " | "	+ getAuthor() + " | " + getType() + " | " + pages;
	
	}
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	
	
	
	
	
	
}
