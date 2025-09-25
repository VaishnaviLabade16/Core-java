
public class Fruit_info {

	public static void main(String args[])
	{
		System.out.println("\n******Non-parammiteriz Constructor********");
		Fruit f1=new Fruit();
		System.out.println("\n Fruit Name: "+f1.name+"\n Fruit Prize: "+f1.prize+"\n Fruit color: "+f1.color);
		
		System.out.println("\n\n******parammiteriz Constructor********");
		Fruit f2=new Fruit("papaya","yellow",300);
		System.out.println("\n Fruit Name: "+f2.name+"\n Fruit Prize: "+f2.prize+"\n Fruit Color: "+f2.color);
		
	}
}
