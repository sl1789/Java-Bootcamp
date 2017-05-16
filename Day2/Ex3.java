package Day2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		System.out.print("Please enter a positive integer: ");
		Scanner scan1 = new Scanner(System.in);
		int val = scan1.nextInt();
		int[] tor = new int[val];
		for (int i=0;i<tor.length;i++){
			tor[i]=i+1;
		}
		for(int i=0;i<tor.length;i++){
		rightShift(tor);
		}
	}
	
	public static void rightShift(int[] arr){
		int t = arr[arr.length-1];
		for(int i=0;i<arr.length-1;i++){
			arr[arr.length-i-1]=arr[arr.length-i-2];
		}
		arr[0]=t;
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}

}
