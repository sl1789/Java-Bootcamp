package day6DataStructures;

//import day3.Author;

public class Book2 {
	private String title;
	private AuthorList authorList;
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

	public AuthorList getAuthorList() {
		return authorList;
	}

	public void setAuthor(AuthorList authorList) {
		this.authorList = authorList;
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
	
	
	
	
	Book2 (String title, Author2[] authorList, String isbn, int physicalCopies, int availableCopies, int timesRented){
		this.title=title;
		this.authorList=new AuthorList(authorList);
		this.isbn=isbn;
		this.physicalCopies=physicalCopies;
		this.availableCopies=availableCopies;
		this.timesRented=timesRented;
	}
	
	
	
	

	public void setTimesRented(int timesRented) {
		this.timesRented = timesRented;
	}

	public String toString(){
		return "[title= "+this.getTitle()+" author= "+this.getAuthorList().toString()+
				" isbn= "+this.getIsbn()+" physicalCopies= "+this.getPhysicalCopies()+
				 " availableCopies= "+this.getAvailableCopies()+" timesRented= "+this.getTimesRented()+"]";
	}
	
	public boolean isAvailable(){
		if (this.availableCopies>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean hasAuthor(String name){
		if (this.authorList.checkAuthor(name)){
			return true;
		}else{
			return false;
		}
	}
	
	public void rentPhysicalCopy(){
		if(this.availableCopies>0){
			System.out.println("Success. You have rented the book");
			this.setAvailableCopies(availableCopies-1);
			this.timesRented++;
		}else{
			System.out.println("Sorry everything is taken");
		}
	}
	

}
