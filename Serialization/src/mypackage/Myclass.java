package mypackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int id;
	String name;
	int salary;
	public Employee (int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
}

public class Myclass 
{
		
	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		Employee emp=new Employee(123456,"Kiran Shiragumpi",80000);
		FileOutputStream fout=new FileOutputStream("C:\\KIRAN\\ArithMaticCalculator Project\\kiran.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(emp);
		out.close();
		System.out.println("Object is saved in a file");

	}

}
