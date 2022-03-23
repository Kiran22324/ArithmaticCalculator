package mypackage;

class EnglishMessage
{
	public void sayHii()
	{
		System.out.println("Hii");
	}
	public void sayHello()
	{
		System.out.println("Helloo");
	}
	public void sayGoodMorning()
	{
		System.out.println("Good Morning");
	}
	
}

class HindiMessage extends EnglishMessage
{

	
	public void sayHello()
	{
		System.out.println("HELLOOOOOO");
	}
	public void sayGoodMorning()
	{
		System.out.println("Shubodaya....");
	}
}


public class Myclass 
{

	public static void main(String[] args) 
	{
		//System.out.println("abcd");
		HindiMessage hm= new HindiMessage();
		hm.sayHello();
		EnglishMessage em=new EnglishMessage();
		em.sayGoodMorning();
		hm.sayHello();
		
	}

}
