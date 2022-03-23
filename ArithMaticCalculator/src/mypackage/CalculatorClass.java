package mypackage;

import java.util.Scanner;
public class CalculatorClass
{

	public static void main(String[] args) 
	{
		try 
		{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		num1=sc.nextInt();
		System.out.println("Enter Second Number:");
		num2=sc.nextInt();
		System.out.println("Arithmatic Operations of two numbers are:");
		System.out.println("Addition of two numbers:"+(num1+num2));
		System.out.println("substraction of two numbers:"+(num1-num2));
		System.out.println("Multiplication of two numbes:"+(num1*num2));
		System.out.println("Division of tow numbers:"+(num1/num2));
		}
		catch(NumberFormatException ex)
		{
			System.out.println("ONLY NUMBERS ARE ALLOWED");
		}
	
	}

}
