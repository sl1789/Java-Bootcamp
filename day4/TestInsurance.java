package day4;

import java.util.Scanner;

public class TestInsurance {

	public static void main(String[] args) {
		
		Customer makis = new Customer("Makis",1973,'M');
		Customer anna = new Customer("Anna",1959,'F');
		Customer mary = new Customer("Mary",1995,'F');
		Customer george = new Customer("George",1985,'M');
		Customer roger = new Customer("Roger",1978,'M');
		Customer maggie = new Customer("Maggie",1938,'F');
		
		
		/*for(int x=0;x<Customer.getCustomerCode();x++){
			System.out.println(Customer.customerTable[x].toString());
		}*/
		
		Health health1 = new Health(makis,3,2000);
		Life life1 = new Life(makis,2,1000);
		Health health2 = new Health(roger,1,3500);
		Health health3 = new Health(maggie,6,5600);
		Health health4 = new Health(george,2,1234);
		Life life2 = new Life(anna,9,5000);
		
		insuranceInterface();
		
	}
	
	public static void insuranceInterface(){
		Scanner scan1 = new Scanner(System.in);
		while(true){//we placed that here as a default kickstart
		System.out.println("***** MENU *****");
		System.out.println("1. Print all insurances");
		System.out.println("2. Search insurances by customer code");
		System.out.println("3. Search insurances by insurance code");
		System.out.println("4. Create a new insurance");
		System.out.println("5. Overview");
		
		int val = scan1.nextInt();
		
		switch(val){
		case 1: Insurance.printAll();break;
		case 2: printCustomer();
				break;
		case 3: printInsurance();
				break;
		case 4: createInsurance();break;
		case 5: Insurance.overview();break;
		case 0: return;
		default: System.out.println("Wrong input. Please try again");
				insuranceInterface();break;
		}
		System.out.println();
		
		
		}
	}
	
	public static void printCustomer(){
		System.out.println("Please enter customer code: ");
		Scanner scan2 = new Scanner(System.in);
		int code = scan2.nextInt();
		if (code<Customer.getCustomerCode()){
			String a = Customer.customerTable[code].getName();
			//System.out.println(code+": "+a);
			for (int x=0; x<Insurance.getInsuranceCode();x++){
				if (Insurance.insuranceTable[x].getCustomer().getName().equals(a)){
					System.out.println(Insurance.insuranceTable[x].toString());
				}
			}
			//System.out.println(Customer.customerTable[code].toString());
		}else{
			System.out.println("This customer does not exist please try again");
			printCustomer();
		}
		
	}
	
	public static void printInsurance(){
		System.out.println("Please enter insurance code: ");
		Scanner scan3 = new Scanner(System.in);
		int code = scan3.nextInt();
		if (code<Insurance.getInsuranceCode()){
			System.out.println(Insurance.insuranceTable[code].toString());
		}else{
			System.out.println("This insurance does not exist please try again");
			printInsurance();
		}
	}
	
	public static void createInsurance(){
		System.out.println("1. Create a new customer");
		System.out.println("2. Create a new insurance for an existing customer");
		Scanner scan4 = new Scanner(System.in);
		int val = scan4.nextInt();
		switch(val){
		case 1: if (Customer.getCustomerCode()<10&&Insurance.getInsuranceCode()<10){
					Customer abc = createCustomer();
					makeInsurance(abc);
				}else{System.out.println("Sorry database full");}
				break;
		case 2:if (Customer.getCustomerCode()<10&&Insurance.getInsuranceCode()<10){
					System.out.println("Give the code of the customer");
					int code = scan4.nextInt();
					makeInsurance(Customer.customerTable[code]);
				}else{System.out.println("Sorry database full");}
				break;
		default: System.out.println("Wrong input");break;
		}
	}
	
	public static Customer createCustomer(){
		System.out.println("Now input the customer data: Name, Year of birth, Sex");
		Scanner scan5 = new Scanner(System.in);
		String a = scan5.next();
		int b = scan5.nextInt();
		char c = scan5.next().charAt(0);
		Customer cust = new Customer(a,b,c);
		return cust;
		
	}
	
	public static void makeInsurance(Customer abc){
		System.out.println("Do you want a life or health insurance? Input 1 for Life and 2 for Health");
		Scanner scan6 = new Scanner(System.in);
		int val = scan6.nextInt();
		if (val==1){
			System.out.println("Input duration and amount of money");
			int dur = scan6.nextInt();
			int am = scan6.nextInt();
			Life life = new Life(abc,dur,am);
		}else if(val==2){
			System.out.println("Input duration and amount of money");
			int dur = scan6.nextInt();
			int am = scan6.nextInt();
			Health health = new Health(abc,dur,am);
		}
	}
	
	
	

}
