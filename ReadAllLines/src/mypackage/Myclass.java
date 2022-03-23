package mypackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Myclass 
{

	public static void main(String[] args) throws IOException 
	{
		File f= new File("C:\\KIRAN\\ArithMaticCalculator Project\\sampletext.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String Line=br.readLine();
		while (Line!=null)
		{
			System.out.println(Line);
			Line=br.readLine();
		}
			br.close();

	}

}
