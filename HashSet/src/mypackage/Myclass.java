package mypackage;

import java.util.HashSet;
import java.util.Iterator;


public class Myclass 
{

	public static void main(String[] args) 
	{
		HashSet<Integer> data=new HashSet<Integer>();
		data.add(2);
		data.add(4);
		data.add(8);
		data.add(5);
		data.add(6);
		data.add(4);
		data.add(2);
		
	
		System.out.println(data.size());
		System.out.println(data);
		
		
	
	}

}
