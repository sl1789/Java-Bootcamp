package day6DataStructures;

public class Author2 {
	private String name;
	
	public String toString(){
		return name;
	}
	
	Author2(){
		this.name="";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Author2(String name){
		this.name=name;
	}

}
