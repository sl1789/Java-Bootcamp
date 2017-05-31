package day4;

import java.time.Year;

public class Health extends Insurance {
	private int amount;
	private static int count2;
	private static int sumH =0;
	public static Health[] healthTable = new Health[10];
	
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	//constructor
	
		Health(Customer customer,int duration, int amount){
			super(customer,duration);
			this.amount=amount;
			healthTable[count2]=this;
			count2+=1;
			sumH+=this.amount;
		}
		
		public static int getCount2() {
			return count2;
		}
		public static int getSumH() {
			return sumH;
		}
		public String toString(){
			return super.toString()+" Type: Health Medical Expense: "+this.amount;
		}
		
		public double insurance_cost(){
			if(this.getCustomer().getSex()=='M'){
				return 80+7*(Year.now().getValue()-this.getCustomer().getYear())+50+0.025*amount;
			}else{
				return 80+7*(Year.now().getValue()-this.getCustomer().getYear())+0.025*amount;
			}
		}
		
		public static int findUnique(){
			int a = Health.getCount2();
			for(int x =0;x<a;x++){
				int i =1;
				for (int y=x+1;y<a;y++){
					if(healthTable[x].getCustomer().getName().equals(healthTable[y].getCustomer().getName())){
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
