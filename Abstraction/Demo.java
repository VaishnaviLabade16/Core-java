package Abstraction;

public class Demo 
{
public static void main(String args[])
{
	System.out.println("\n\n*******Area of Circle*************");
	Circle c=new Circle();
	c.area();
	
	System.out.println("\n\n*******Area of Square************");
	Square s=new Square();
	s.area();
	
	System.out.println("\n\n*******Area of Triangle************");
	Triangle t=new Triangle();
	t.area();
}
}
