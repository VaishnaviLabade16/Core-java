
public class Bird_info 
{
	public static void main(String args[])
	{
		System.out.println("\n*********Non-Parameteriz Constructor***********");
	Bird b=new Bird();
	System.out.println("\n Bird Name: "+b.name+"\n Bird Age: "+b.age+"\n Bird Color: "+b.color);
	
	System.out.println("\n\n*********Parameteriz Constructor***********");
	Bird b2=new Bird("more","multicolour",12);
	System.out.println("\n Bird Name: "+b2.name+"\n Bird Age: "+b2.age+"\n Bird Color: "+b2.color);
	}
}
