package mypackage;

import java.util.LinkedList;

public class Myclass 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> data=new LinkedList<Integer>();
		data.add(55);
		data.add(85);
		data.add(74);
		data.add(24);
		data.add(46);
		
		System.out.println(data.size());
		System.out.println(data.get(3));
		System.out.println(data.contains(100));
	
	}

}
