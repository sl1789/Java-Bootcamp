import java.util.Scanner;
public class Ex5 {

	public static void main(String[] args) {
		System.out.println("Please enter a positive integer number: ");
		Scanner scan1 = new Scanner(System.in);
		int val = scan1.nextInt();
		for (int i=0; i <val;i++){
			System.out.print((i+1)*(i+2) + " ");
		}

	}

}
