package mypackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class Myclass 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> data=new PriorityQueue<>();
		data.add(88);
		data.add(44);
		data.add(100);
		data.add(48);
		data.add(66);
		data.add(15);
		
		System.out.println(data.size());
		System.out.println(data.poll());
		System.out.println(data.peek());
		

	}

}
