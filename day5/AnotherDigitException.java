package day5;

public class AnotherDigitException extends Exception{
	private int num;
	
	AnotherDigitException(){
		this.num=230;
	}

	public int getNum() {
		return num;
	}

}
