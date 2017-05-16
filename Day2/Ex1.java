package Day2;

public class Ex1 {

	public static void main(String[] args) {
		
		System.out.println(bootCamp(25,91));
		System.out.println(bootCamp(91,25));
	}
		public static int bootCamp(int number1, int number2){
			if (number1<number2){
				return (int)Math.abs(Math.sqrt((number2-number1)));
			}else{
				return (int)(number1+number2);
			}
		

	}

}
