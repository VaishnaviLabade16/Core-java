package Exception;

public class Demo1 
{
	public static void main(String args[])
	{
			System.out.println(5/0);
		ArithmeticException ae=new ArithmeticException("/by Zero");
		throw ae;
	}
}
