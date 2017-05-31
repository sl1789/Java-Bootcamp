package day3;

public class Circle {
	static final double PI = 3.14;
	private int x;
	private int y;
	private int r;
	private static int count;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	Circle(){
		this.x = 0;
		this.y = 0;
		this.r = 5;
		count+=1;
	}
	
	Circle(int x,int y, int r){
		this.x=x;
		this.y=y;
		this.r=r;
		count+=1;
	}
	
	
	
	public void printCircleDetails(){
		System.out.printf("I'm a circle at point (%d, %d) with radius %d", this.x,this.y,this.r);
		System.out.println("");
	}
	
	Circle(int x, int y){
		this();
		this.x=x;
		this.y=y;
		//count+=1;
	}
	
	public double calculateArea(){
		double area = PI*Math.pow(this.r,2);
		return area;
	}
	
	public double calculatePerimeter(){
		double per = PI*2*this.r;
		return per;
	}
	
	
	public Circle(Circle original) {
	    this(original.x, original.y, original.r);
	    //count+=1;
	}
	
	
	public boolean cocentric(Circle a){
		if ((a.x==this.x)&&(a.y==this.y)){
			return true;
		}else{
			return false;
		}
	}
	
	public static int getCount() { return count; }

}
