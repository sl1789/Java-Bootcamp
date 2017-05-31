package day6DataStructures;

//import java.util.Arrays;

public class Librarian2 {

	private TransactionQueue transQueue;
	private Library2 library;

	public Library2 getLibrary() {
		return library;
	}

	public void setLibrary(Library2 library) {
		this.library = library;
	}

	public TransactionQueue getTransQueue() {
		return transQueue;
	}

	/*public void setTransQueue(TransactionQueue transQueue) {
		this.transQueue = new TransactionQueue();
	}*/

	Librarian2(Library2 library) {
		this.library = library;
		this.transQueue = new TransactionQueue();
	}

	public void executePendingTransactions() {
		if(this.getTransQueue().transQueue.size()>0){
		for (int i = 0; i < this.getTransQueue().transQueue.size(); i++) {
			if (this.getTransQueue().transQueue.get(i).getBook().isAvailable()) {
				this.getTransQueue().transQueue.get(i).getBook().rentPhysicalCopy();
				this.getTransQueue().transQueue.get(i).setServedDate();
				Transaction a = this.getTransQueue().transQueue.get(i);
				this.library.getTransHistory().transHistory.add(a);
				System.out.println("Transaction "+(i+1)+" complete");
			} else {
				this.getTransQueue().transQueue.get(i).setServedDate();
				Transaction a = this.getTransQueue().transQueue.get(i);
				this.library.getTransHistory().transHistory.add(a);
				System.out.println("Transaction not complete. Book is not available");
			}
		}
		this.getTransQueue().transQueue.clear();
		}else{
			System.out.println("No transactions left");
		}
	}

	public void printAllPending() {
		for (int i = 0; i < this.getTransQueue().transQueue.size(); i++) {
			System.out.println(this.getTransQueue().transQueue.get(i).toString()+" Yes why not?");
		}
	}

	public void rentPhysicalCopy(String title) {

		if (this.library.getBookList().exists(title)) {
			int b = -1;
			for (int i = 0; i < this.library.getBookList().bookList.size(); i++) {
				if (this.getLibrary().getBookList().bookList.get(i).getTitle().equals(title)) {
					b = i;
				}
			}
			if (b > -1) {
				Transaction tr = new Transaction(this.library.getBookList().bookList.get(b));
				this.transQueue.addTransaction(tr);
				//System.out.println("Transaction created");
			}else{
				System.out.println("Unknown error");
			}
		} else {
			System.out.println("Sorry book not in our list");
		}

	}

	public void printTransactionHistory() {
		this.library.printHistory();
	}

	public void findMeAvailableBooks() {
		this.library.getBookList().printAvailableBooks();
	}

	public void findMeBook(String title) {
		this.library.getBookList().printBookDetails(title);
	}

	public void findMeBooksFromAuthor(String name) {
		this.library.getBookList().printBooksFromAuthor(name);
	}

	public void findMostPopularBook() {
		this.library.getBookList().printTheMostPopularBook();
	}

}
