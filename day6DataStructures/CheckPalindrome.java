package day6DataStructures;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter test message: ");
		String s = scan.nextLine();
		System.out.println("Is it a palindrome? : "+check(s));

	}
	
	public static boolean check(String s){
		char[] c = s.toCharArray();
		int len = c.length;
		boolean flag = true;
		int i = 0;
		while(i<(len/2)&&flag==true){
			if (c[i]!=c[len-i-1]){
				flag= false;
			}
			i+=1;
			
		}
			
		return flag;
	}

}
