package day3;

public class Librarian {
	private Library library;

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}
	
	Librarian(Library library){
		this.library=library;
	}
	
	public void findMeBooksFromAuthor(String name){
		this.library.printBooksFromAuthor(name);
	}
	
	public void findMeAvailableBooks(){
		this.library.printAvailableBooks();
	}
	
	public void findMeBook(String title){
		this.library.printBookDetails(title);
	}
	
	public void findMostPopularBook(){
		this.library.printTheMostPopularBook();
	}
	

}
