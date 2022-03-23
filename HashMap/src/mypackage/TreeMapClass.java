package mypackage;

import java.util.TreeMap;

public class TreeMapClass 
{

	public static void main(String[] args) 
	{
		TreeMap<String,Integer> data=new TreeMap<String,Integer>();
		
		data.put("KANNADA", 115);
		data.put("ENGLISH", 85);
		data.put("HINDI", 75);
		data.put("SOCIAL SCIENCE", 82);
		data.put("SCIENCE", 95);
		data.put("MATHS",84);
		
		
		//var keys=data.keySet();
		//System.out.println(keys);
		System.out.println(data);
		

	}

}
