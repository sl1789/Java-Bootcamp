import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		System.out.println("Enter 9 digit Number: ");
		Scanner scan1 = new Scanner(System.in);
		int val = scan1.nextInt();
		int[] digits = new int[9];
		digits[digits.length-1]=val%10;
		for (int i = 0; i<8;i++){
			digits[i]= val/(int)(Math.pow(10, 8-i));
			val%=(int)(Math.pow(10, 8-i));
		}
		for(int i =0;i<digits.length;i=i+3){
			System.out.print(digits[i]+ "\t\t\t");
		}
		System.out.println(" ");
		System.out.print("\t");
		for(int i =1;i<digits.length;i=i+3){
			System.out.print(digits[i]+ "\t\t\t");
		}
		System.out.println(" ");
		System.out.print("\t\t");
		for(int i =2;i<digits.length;i=i+3){
			System.out.print(digits[i]+ "\t\t\t");
		}

	}

}
