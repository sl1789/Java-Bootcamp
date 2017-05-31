package day5;

public class Circle implements Shape {
	
	protected double radius;
	final double PI = 3.14;
	
	Circle(double radius){
		this.radius=radius;
	}

	@Override
	public double getParameter() {
		// TODO Auto-generated method stub
		return this.radius;
	}

	@Override
	public double getArea(double radius) {
		
		return Math.pow(radius, 2)*PI;
	}

}
