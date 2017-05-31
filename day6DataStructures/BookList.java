package day6DataStructures;

import java.util.Arrays;
import java.util.LinkedList;


public class BookList {
	
	public LinkedList<Book2> bookList;

	public LinkedList<Book2> getBookList() {
		return bookList;
	}

	public void setBookList(LinkedList<Book2> bookList) {
		this.bookList = bookList;
	}
	
	BookList(){
		bookList=null;
	}
	
	BookList(Book2[] books){
		this.bookList= new LinkedList<Book2>(Arrays.asList(books));
	}
	
	public boolean exists(String title){
		//int i = 0;
		boolean a = false;
		for(int i=0;i<this.bookList.size();i++){
			if(this.bookList.get(i).getTitle().equals(title)){
				a = true;
			}
		}
		return a;
	}
	
	public void addBook(Book2 book){
		if(!exists(book.getTitle())){
			this.bookList.add(book);
			
		}
	}
	
	public void removeBook(String title){
		if (exists(title)){
			for (int i =0;i<bookList.size();i++){
				if(bookList.get(i).getTitle().equals(title)){
					bookList.remove(i);
				}
			}
		}
	}
	
	
	public void printAvailableBooks(){
		for (Book2 x:bookList){
			if (x.isAvailable()){
				System.out.println(x.toString());
			}
		}
	}
	
	public void printBookDetails(String title){
		boolean beornot=false;
		for (Book2 x:bookList){
			if(x.getTitle().equals(title)){
				System.out.println(x.toString());
				beornot=true;
			}
		}
		if (!beornot){
			System.out.println("Sorry book not found");
		}
		}
	
	public void printBooksFromAuthor(String name){
		for (Book2 x:bookList){
			if(x.hasAuthor(name)){
				System.out.println(x.toString());
			}
		}
	}
	
	public void printTheMostPopularBook(){
		int max=0;
		Book2 maxBook = new Book2("",new Author2[]{},"000",10,10,10);
		for (Book2 x:bookList){
			if(x.getTimesRented()>max){
				max=x.getTimesRented();
				maxBook =x;
			}
		}
		System.out.println(maxBook.toString());
	}
	
	
	

}
