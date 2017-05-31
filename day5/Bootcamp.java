package day5;
import java.io.*;
public class Bootcamp {
	
	
	public static void welcome(double a)throws DigitException,AnotherDigitException{
		if (a>25){
			throw new DigitException();
		}else{
			throw new AnotherDigitException();
		}
	}
	
	public static int bye(){
		try{
		welcome(299.7);
		}catch(DigitException e){
			return e.getNum();
			//System.out.println(e.getNum());
		}catch(AnotherDigitException e){
			return e.getNum();
			//System.out.println(e.getNum());
		}
		return 1;
		
	}
	
	public static void main(String args[]){
		System.out.println(bye());
	}

}
