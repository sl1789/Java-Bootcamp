
public class Ex1 {

	public static void main(String[] args) {
		int[] arr1 = new int[9];
		for (int i=0; i<arr1.length; i++){
			arr1[i]=0;
		}
	
		
		for(int inc =1; inc<=9; inc++){
			
			for(int j=1; j<=inc; j++){
				arr1[9-j]=inc;
			}
			for(int i=0; i<arr1.length;i++){
				System.out.print(arr1[i]);
			}
			System.out.println("");
		}

	}

}
