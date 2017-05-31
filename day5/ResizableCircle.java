package day5;

import java.util.Scanner;

public class ResizableCircle extends Circle implements Resizable {
	
	public double num;
	
	ResizableCircle(double radius, double num){
		super(radius);
		this.num=num;
	}

	@Override
	public double resize(double radius,double num) {
		
		return radius*num;
	}

	public static void main(String[] args) {
		System.out.println("Please input Radius and resize percentage in double format");
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double n = scan.nextDouble();
		ResizableCircle rc = new ResizableCircle(r,n);
		System.out.println(rc.getArea(rc.resize(r, n)));

	}

}
