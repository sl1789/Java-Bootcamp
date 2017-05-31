package day6DataStructures;

import java.util.Scanner;

public class TestCaesar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter test message: ");
		String s = scan.nextLine();
		System.out.println("Please enter number of shifts: ");
		int num = scan.nextInt();
		String cipher = CeasarsCipher.cipher(s, num);
		System.out.println(cipher);
		String decipher = CeasarsCipher.decipher(cipher, num);
		System.out.println(decipher);

	}

}
