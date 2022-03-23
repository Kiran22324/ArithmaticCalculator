package mypackage;

import java.util.TreeSet;

public class Myclass 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> data=new TreeSet<Integer>();
		data.add(55);
		data.add(48);
		data.add(18);
		data.add(545);
		data.add(18);
		data.add(78);
		data.add(45);
		data.add(54);
		
		System.out.println(data.size());
		//System.out.println(data.remove(54));
		//System.out.println(data.pollFirst());
		//System.out.println(data.pollLast());
		System.out.println(data);
		System.out.println(data.descendingSet());
		System.out.println(data.headSet(545));

	}

}
