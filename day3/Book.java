package day3;

public class Book {
	private String title;
	private Author author;
	private final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}


	public int getPhysicalCopies() {
		return physicalCopies;
	}

	public void setPhysicalCopies(int physicalCopies) {
		this.physicalCopies = physicalCopies;
	}

	public int getAvailableCopies() {
		return availableCopies;
	}

	public void setAvailableCopies(int availableCopies) {
		this.availableCopies = availableCopies;
	}

	public int getTimesRented() {
		return timesRented;
	}
	
	
	
	
	Book (String title, Author author, String isbn, int physicalCopies, int availableCopies, int timesRented){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
		this.physicalCopies=physicalCopies;
		this.availableCopies=availableCopies;
		this.timesRented=timesRented;
	}
	
	
	
	

	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}

	public String toString(){
		return "[title= "+this.getTitle()+" author= "+this.getAuthor().toString()+
				" isbn= "+this.getIsbn()+" physicalCopies= "+this.getPhysicalCopies()+
				 " availableCopies= "+this.getAvailableCopies()+" timesRented= "+this.getTimesRented()+"]";
	}
	
	public void rentPhysicalCopy(){
		if(this.availableCopies>0){
			System.out.println("Success. You can rent the book");
			this.setAvailableCopies(availableCopies--);
			this.timesRented++;
		}else{
			System.out.println("Sorry everything is taken");
		}
	}
	
	public boolean isAvailable(){
		if (this.availableCopies>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean hasAuthor(String name){
		if (this.author.toString().equals(name)){
			return true;
		}else{
			return false;
		}
	}
	
	

}
