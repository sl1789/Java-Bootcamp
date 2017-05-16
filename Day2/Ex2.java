package Day2;

public class Ex2 {

	public static void main(String[] args) {
		
		roll();
	}
		public static void roll(){
			int count = 0;
			int a,b;
			do{
				a = (int)(Math.random()*6+1);
				b = (int)(Math.random()*6+1);
				count++;
			}while(a!=1||b!=1);
			
			System.out.printf("Both dice are 1. It took us %d times to get it",count);
		}
	
	
	

}
