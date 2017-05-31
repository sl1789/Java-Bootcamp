package day4;

public abstract class Insurance {
	private static int insuranceCode;
	private Customer customer;
	private int duration;
	public static Insurance[] insuranceTable= new Insurance[10];
	
	public static int getInsuranceCode() {
		return insuranceCode;
	}

	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	//constructors
	
	Insurance(Customer customer,int duration){
		this.customer=customer;
		this.duration=duration;
		insuranceTable[insuranceCode]=this;
		insuranceCode+=1;
	}
	
	//methods
	public String toString(){
		return "Customer data: "+this.getCustomer().toString()+
				" Contract duration: "+this.getDuration()+ " Contract Cost: "+this.insurance_cost();
	}
	
	public abstract double insurance_cost();
	
	public static void printAll(){
		for (int x =0;x<Insurance.getInsuranceCode();x++){
			System.out.println(Insurance.insuranceTable[x].toString());
		}
	}
	
	public void printOne(int code){
		System.out.println(insuranceTable[code].toString());
	}
	
	public static void overview(){
		System.out.println("Life: "+Life.getCount()+" unique customers: "+Life.findUnique(Life.lifeTable)+" Average: "+Life.getSumL()/Life.getCount());
		System.out.println("Health: "+Health.getCount2()+ " unique customers: "+Health.findUnique()+" Average: "+Health.getSumH()/Health.getCount2());
	}

}
