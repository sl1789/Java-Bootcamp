package day6DataStructures;

import java.util.ArrayList;

public class TransactionHistory {
	
	public ArrayList<Transaction> transHistory;

	public ArrayList<Transaction> getTransHistory() {
		return transHistory;
	}

	public void setTransHistory(ArrayList<Transaction> transHistory) {
		this.transHistory = transHistory;
	}
	
	TransactionHistory(){
		transHistory=new ArrayList<Transaction>();
	}
	
	public void addTransaction(Transaction t){
		transHistory.add(t);
	}
	
	public void removeTransaction(Transaction t){
		transHistory.remove(t);
	

}
}
