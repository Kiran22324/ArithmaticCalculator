package mypackage;

import java.util.Stack;

public class Myclass 
{

	public static void main(String[] args) 
	{
		Stack<Integer> data=new Stack<Integer>();
		data.push(45);
		data.push(44);
		data.push(10);
		data.push(74);
		data.push(45);
		data.push(76);
		data.push(88);
		data.push(74);
		data.push(44);
		data.push(50);
		
		//Total number of elements present in stack which duplicate numbers
		System.out.println(data.size());
		
		//"pop" will remove last element.Which follows Last In First Out.
		System.out.println(data.pop());
		
		//"peek" keyword will display top of the element
		System.out.println(data.peek());
		
		//"elementAt" keyword is used to check value at index position
		System.out.println(data.elementAt(6));
		
	}

}
