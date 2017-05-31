import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		System.out.println("Enter Tax Identification Number: ");
		Scanner scan1 = new Scanner(System.in);
		int val = scan1.nextInt();
		int[] digits = new int[9];
		digits[digits.length-1]=val%10;
		for (int i = 0; i<8;i++){
			digits[i]= val/(int)(Math.pow(10, 8-i));
			val%=(int)(Math.pow(10, 8-i));
		}
		int sum = 0;
		for (int i=0;i<digits.length-1;i++){
			sum+=(int)digits[i]*Math.pow(2, 8-i);
			//System.out.println(sum);
		}//System.out.println(sum);
		sum = sum%11;
		sum = sum%10;
		
			System.out.print(Arrays.toString(digits));
			System.out.println(" " + sum);
		if (sum==digits[digits.length-1]){
			System.out.println("Tax Identification Number valid.");
		}else {
			System.out.println("Tax Identification Number invalid.");
		}
	}

}
