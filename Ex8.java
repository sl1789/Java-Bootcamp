import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		System.out.println("Enter 10 digit Number: ");
		Scanner scan1 = new Scanner(System.in);
		long val = scan1.nextLong();
		int[] digits = new int[10];
		digits[digits.length-1]=(int)(val%10);
		for (int i = 0; i<9;i++){
			digits[i]= (int)(val/(int)(Math.pow(10, 9-i)));
			val%=(int)(Math.pow(10, 9-i));
		}
		
		for(int i =0;i<digits.length;i=i+2){
			System.out.print(digits[i]+ "\t\t");
		}
		System.out.println(" ");
		System.out.print("\t");
		for(int i =1;i<digits.length;i=i+2){
			System.out.print(digits[i]+ "\t\t");
		}

	}

}
