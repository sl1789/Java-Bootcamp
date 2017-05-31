package day6DataStructures;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();
        myStack.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8,9,10}));
        System.out.println("initial stack: " + myStack);
        System.out.println("reversed stack: " + reverse(myStack));

	}
	
	public static Stack<Integer> reverse(Stack<Integer> initial){
		Stack<Integer> s1 =  (Stack<Integer>)initial.clone();
		Stack<Integer> s2 = new Stack<>();
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2;
		
	}

}
