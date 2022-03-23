package mypackage;

import java.util.Scanner;

public class Myclass 
{

	public static void main(String[] args) 
	{
		try
		{
		int a1,b1;
		System.out.println("ENTER NUMBER:");
		System.out.println("ENTER FIRST NUMBER:");
		Scanner sc=new Scanner(System.in);
		
		a1 =sc.nextInt();
		System.out.println("ENETER SECOND NUMBER:");
		b1=sc.nextInt();
		
		System.out.println("Addintion of two numbers:"+(a1+b1));
		}
		catch(Exception ex)
		
		{
			System.out.println("Only Numbers Are Allowed");
		}
		

	}

}
