package day4;

import java.time.Year;

public class Life extends Insurance{
	private int amount;
	private static int count;
	private static double sumL=0;
	public static Life[] lifeTable = new Life[10];

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	//constructor
	
	Life(Customer customer,int duration, int amount){
		super(customer,duration);
		this.amount=amount;
		lifeTable[count]=this;
		count+=1;
		sumL+=this.amount;
	}
	
	public static int getCount() {
		return count;
	}

	public static double getSumL() {
		return sumL;
	}

	//methods
	public String toString(){
		return super.toString()+" Type: Life Amount invested: "+this.amount;
	}
	
	public double insurance_cost(){
		return 5*(Year.now().getValue()-this.getCustomer().getYear())+0.05*this.amount;
	}
	
	public static int findUnique(Life[] lifeTable){
		int a = Life.getCount();
		for(int x =0;x<a;x++){
			int i =1;
			for (int y=x+1;y<a;y++){
				if(lifeTable[x].getCustomer().getName().equals(lifeTable[y].getCustomer().getName())){
					i++;
				}
				}
			if (i>1){
				a--;
			}
		}
		return a;
	}

}
