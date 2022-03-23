package mypackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Myclass2 
{

	public static void main(String[] args) throws IOException 
	{
		File f=new File("C:\\KIRAN\\Phase-1 OOPs Concept\\ArithMaticCalculator Project\\sampletext.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i!=-1)
			{
			System.out.println((char)i);
			}
			i=fr.read();
			fr.close();
	}
		
}
