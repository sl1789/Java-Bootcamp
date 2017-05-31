package day6DataStructures;

import java.util.ArrayList;

public class FindMinAndPosition {

	public static void main(String[] args) {
		int[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
	    find(array);
	}
	
	public static void find(int[] array){
		int min = array[0];
		ArrayList<Integer> list= new ArrayList<>();
		list.add(0);
		for (int i =1; i<array.length;i++){
			if(array[i]==min){
				list.add(i);
			}else if(array[i]<min){
				min = array[i];
				list.clear();
				list.add(i);
			}
		}
		System.out.printf("Min is %d in positions: ",min);
		System.out.println(list);
	}

}
