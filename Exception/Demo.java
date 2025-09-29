package Exception;

public class Demo 
{
public static void main(String args[])
{
	try
	{
		System.out.println(5/5);
		System.out.println(5/0);
	}
	catch(Exception e)
	{
		System.out.println("Bad maths !");
	}
	finally
	{
		System.out.println("Bye !");
	}
}
}
