package Day2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		char[][] tic= new char[3][3];
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
			tic[i][j]='-';
			}
		}
		
		int count = 0;
		char previous= ' ';
		while (count<=9&&!check(tic,count)){
			drawFunction(tic);
			if (count ==9 ){
				System.out.println("It's a draw");
				break;
			}else{
				
			System.out.println("Player please enter 2 integers 0-2 and 'X' or 'O': ");
			Scanner scan1 = new Scanner(System.in);
			int i = scan1.nextInt();
			int j = scan1.nextInt();
			char c =scan1.next().charAt(0);
			
			
			if (previous!=c){
				
			
			if (tic[i][j]=='-'){
				tic[i][j]= c;
				previous = c;
			}else{
				System.out.println("Invalid move");
				break;
			}
			count++;
			//check(tic,count);
			}else{
				System.out.println("You played twice bro");
				break;
			}
			
			}
			
		}
		
	}
	
	public static void drawFunction(char[][] arr){
		for (int i=0;i<3;i++){
			for (int j=0;j<3;j++){
			System.out.print(arr[i][j]+" ");;
			}
			System.out.println(" ");
		}
	}
	
	public static boolean check(char[][] arr, int moves){
		if (moves<9){
		for (int i=0;i<3;i++){
			int count1 = 0;
			int count2 = 0;
			for (int j=0;j<3;j++){
				if (arr[i][j]=='X'){
					count1++;
				}else if(arr[i][j]=='O'){
					count2++;
				}
			}
			if(count1==3){
				System.out.println("Player 1 wins");
				return true;
			}else if(count2==3){
				System.out.println("Player 2 wins");
				return true;
			}
		}
		for (int j=0;j<3;j++){
			int count1 = 0;
			int count2 = 0;
			for (int i=0;i<3;i++){
				if (arr[i][j]=='X'){
					count1++;
				}else if(arr[i][j]=='O'){
					count2++;
				}
			}
			if(count1==3){
				System.out.println("Player 1 wins");
				return true;
			}else if(count2==3){
				System.out.println("Player 2 wins");
				return true;
			}
		}
		for (int j=0;j<3;j++){
			int count1 = 0;
			int count2 = 0;
			
				if (arr[j][j]=='X'){
					count1++;
				}else if(arr[j][j]=='O'){
					count2++;
				}
			
			if(count1==3){
				System.out.println("Player 1 wins");
				return true;
			}else if(count2==3){
				System.out.println("Player 2 wins");
				return true;
			}
		}
		for (int j=0;j<3;j++){
			int count1 = 0;
			int count2 = 0;
			
				if (arr[j][2-j]=='X'){
					count1++;
				}else if(arr[j][2-j]=='O'){
					count2++;
				}
			
			if(count1==3){
				System.out.println("Player 1 wins");
				return true;
			}else if(count2==3){
				System.out.println("Player 2 wins");
				return true;
			}
		}
		//System.out.println("There are " + (9-moves)+" moves left in the game");
		return false;
	}else{
		return false;
	}
	}
	}

