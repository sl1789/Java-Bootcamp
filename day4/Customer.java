package day4;

public class Customer {
	private static int customerCode;
	private String name;
	private int year;
	private char sex;
	public static Customer[] customerTable = new Customer[10];
	
	public static int getCustomerCode() {
		return customerCode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public Customer[] getCustomerTable() {
		return customerTable;
	}
	
	//constructor
	Customer(String name, int year, char sex){
		this.name=name;
		this.year=year;
		this.sex=sex;
		customerTable[customerCode]=this;
		customerCode+=1;
			}
	
	public String toString(){
		return " Customer name: "+this.getName()+
				" Year of birth: "+this.getYear()+" Sex: "+this.getSex();
	}

}
