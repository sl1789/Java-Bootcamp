package day3;

public class Author {
	private String name;
	
	public String toString(){
		return name;
	}
	
	Author(){
		this.name="";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Author(String name){
		this.name=name;
	}

}
