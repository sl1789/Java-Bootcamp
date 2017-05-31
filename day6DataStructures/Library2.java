package day6DataStructures;

//import java.util.ArrayList;

public class Library2 {
	private BookList bookList;
	private TransactionHistory transHistory;

	public BookList getBookList() {
		return bookList;
	}

	public void setBookList(BookList bookList) {
		this.bookList = bookList;
	}
	
	public TransactionHistory getTransHistory() {
		return transHistory;
	}

	Library2(BookList bookList){
		this.bookList=bookList;
		this.transHistory=new TransactionHistory();
	}
	
	public void printHistory(){
		for (int i =0;i<this.getTransHistory().transHistory.size();i++){
			System.out.println(this.getTransHistory().transHistory.get(i).toString()+" Served Date: "+this.getTransHistory().transHistory.get(i).getServedDate());
		}
	}
	
	/*public void rentPhysicalCopy(){
		// fill this in re man
	}
	*/
	

}
