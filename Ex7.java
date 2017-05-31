import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		System.out.println("Enter 8 digit Binary Number: ");
		Scanner scan1 = new Scanner(System.in);
		int val = scan1.nextInt();
		int[] digits = new int[8];
		digits[digits.length-1]=val%2;
		for (int i = 0; i<7;i++){
			digits[i]= val/(int)(Math.pow(2, 8-i));
			val%=(int)(Math.pow(2, 8-i));
		}
		
		int sum = 0;
		for (int i = 0;i<digits.length;i++){
			sum+=digits[i];
		}
		if (sum%2==0){
			System.out.println("Parity check ok");
		}else{
			System.out.println("Parity check not ok");
		}

	}

}
