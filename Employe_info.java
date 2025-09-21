
public class Employe_info {

	public static void main(String args[])
	{
		System.out.println("\n*********Non-Paramiterize constructor*********");
		Employe e=new Employe();
		System.out.println("\n Employe Name: "+e.name+"\n Employe id: "+e.id+"\n Employe Age: "+e.age);
		
		System.out.println("\n\n*********Paramiterize constructor*********");
		Employe e1=new Employe("karina",2,21);
		System.out.println("\n Employe Name: "+e1.name+"\n Employe id: "+e1.id+"\n Employe Age: "+e1.age);
		
	}
}
