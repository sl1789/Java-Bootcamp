package day6DataStructures;

//import java.util.Calendar;
import java.util.Date;
//import java.util.GregorianCalendar;

public class Transaction {
	
	private Date servedDate;
	private Date requestTransactionDate;
	private static int counter;
	private final int id;
	private Book2 book;
	
	
	
	public Date getServedDate() {
		return servedDate;
	}




	public Date getRequestTransactionDate() {
		return requestTransactionDate;
	}



	public void setRequestTransactionDate(Date requestTransactionDate) {
		this.requestTransactionDate = requestTransactionDate;
	}



	public static int getCounter() {
		return counter;
	}



	public Book2 getBook() {
		return book;
	}



	public void setBook(Book2 book) {
		this.book = book;
	}



	public int getId() {
		return id;
	}



	Transaction(Book2 book){
		counter+=1;
		this.id=counter;
		this.book=book;
		this.requestTransactionDate= new Date();
		this.servedDate= new Date();
		
	}
	
	public String toString(){
		return "Id: "+this.getId()+" Book details: "+this.book.toString()+" Request Date: "+this.getRequestTransactionDate();
	}
	


	public void setServedDate() {
		this.servedDate = new Date();
	}


}
