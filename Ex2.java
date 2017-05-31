import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		int[] euro = new int[6];
		int [] val = {50, 20, 10, 5, 2, 1};
		Scanner scan1 = new Scanner(System.in);
		for(int i=0;i<6;i++){
			euro[i]= scan1.nextInt();
			}
	
	    System.out.println("Your number of 50 euro banknotes: " + euro[0]);
	    System.out.println("Your number of 20 euro banknotes: " + euro[1]);;
	    System.out.println("Your number of 10 euro banknotes: " + euro[2]);
	    System.out.println("Your number of 5 euro banknotes: " + euro[3]);
	    System.out.println("Your number of 2 euro coins: " + euro[4]);;
	    System.out.println("Your number of 1 euro coins: " + euro[5]);
	    int sum = 0;
	    for(int i=0;i<6;i++){
	    	sum+= euro[i]*val[i];
	    }
	    System.out.printf("You have %d euros",sum);

	}

}
