package day6DataStructures;

import java.util.ArrayList;

public class TransactionQueue {
	
	public ArrayList<Transaction> transQueue;
	
	
	
	public  ArrayList<Transaction> getTransQueue() {
		return transQueue;
	}

	public  void setTransQueue(ArrayList<Transaction> transQueue) {
		this.transQueue = transQueue;
	}

	TransactionQueue(){
		this.transQueue = new ArrayList<Transaction>();
	}
	
	public  void addTransaction(Transaction t){
		transQueue.add(t);
	}
	
	public void removeTransaction(Transaction t){
		transQueue.remove(t);
	}
	
	

}
