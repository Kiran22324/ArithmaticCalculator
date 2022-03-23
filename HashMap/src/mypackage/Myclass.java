package mypackage;

import java.util.HashMap;

public class Myclass 
{

	public static void main(String[] args) 
	{
		HashMap<String,Integer> data=new HashMap<String,Integer>();
		data.put("KANNADA", 115);
		data.put("ENGLISH", 85);
		data.put("HINDI", 75);
		data.put("SOCIAL SCIENCE", 82);
		data.put("SCIENCE", 95);
		data.put("MATHS",84);
		
		System.out.println(data);
		System.out.println(data.get("SCIENCE"));
		
		
	}

}
