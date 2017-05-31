package day3;

public class TestCircles {

	public static void main(String[] args) {
		Circle a = new Circle();
		a.setX(2);
		a.setY(3);
		a.setR(10);
		a.printCircleDetails();
		
		Circle b = new Circle(4,1);
		b.printCircleDetails();
		
		Circle c= new Circle(1,2,3);
		c.printCircleDetails();
		System.out.println("This circle has an area of: "+ c.calculateArea() 
		+ " and a perimeter of: " + c.calculatePerimeter());
		
		Circle d = new Circle(c);
		d.printCircleDetails();
		c.setR(6);c.setX(4);c.setY(5);
		c.printCircleDetails();
		d.printCircleDetails();

	}

}
