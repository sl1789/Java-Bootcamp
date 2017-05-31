package day6DataStructures;

public class User {
	private String name;
	private final int id;
	public TransactionHistory th;
	private User next;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TransactionHistory getTh() {
		return th;
	}
	public void setTh(TransactionHistory th) {
		this.th = th;
	}
	public User getNext() {
		return next;
	}
	public void setNext(User next) {
		this.next = next;
	}
	public int getId() {
		return id;
	}
	
	User(int count, String name){
		this.next=null;//maybe from input
		this.th= new TransactionHistory();
		this.id=count;
		this.name=name;
	}

}
