package day5;

public class ShapeC implements Agreeable {
	int width;
	int height;
	
	ShapeC(){
		
	}
	
	ShapeC(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	public int calcArea(){
		return this.width*this.height;
	}

	@Override
	public void isSmallerThan(ShapeC s2) {
		if(this.calcArea()>s2.calcArea()){
			System.out.println("Shape 1 is larger");
		}else if(this.calcArea()<s2.calcArea()){
			System.out.println("Shape 2 is larger");
		}else{
			System.out.println("They are equal");
		}

	}

	public static void main(String[] args) {
		ShapeC s1 = new ShapeC(9,2);
		ShapeC s2 = new ShapeC(4,2);
		s1.isSmallerThan(s2);

	}

}
