import java.util.Scanner;


public class Ex3 {

	public static void main(String[] args) {
		double[] val = new double[3];
		System.out.println("Please enter 3 numbers: ");
		Scanner scan1 = new Scanner(System.in);
		for(int i=0;i<3;i++){
		val[i]= scan1.nextDouble();
		}
		double D = Math.pow(val[1], 2)-4*val[0]*val[2];
		if (D>=0){
			double x1 = (-val[1]+Math.sqrt(D))/(2*val[0]);
			double x2 = (-val[1]-Math.sqrt(D))/(2*val[0]);
			System.out.printf("The solutions of the quadratic are: %.2f and %.2f. /n", x1, x2);
		}
		else{
			System.out.println("Sorry the output is complex number");
		}
	}

}
