package Day2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		System.out.print("Please enter a positive integer: ");
		Scanner scan1 = new Scanner(System.in);
		int val = scan1.nextInt();
		int[] tor = new int[val];
		for (int i=0;i<tor.length;i++){
			tor[i]=i+1;
		}
		
		Double[] arr= new Double[tor.length];
		for (int i=0;i<arr.length;i++){
			arr[i]=(double) tor[i];
		}
		for (int i=0;i<arr.length;i++){
			arr[i]=(Double) arr[i];
			System.out.print(arr[i]+" ");
		}
		
	}

}
