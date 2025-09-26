package Encapsulation;

public class Product_info 
{
	public static void main(String args[])
	{
		System.out.println("**************Non-Paramitrize constructor***********\n");
		
		
        Product p=new Product();
        System.out.println(p.Pid);
        System.out.println(p.Pname);
        System.out.println(p.PDescription);
        System.out.println(p.Pprice);
        System.out.println(p.Quantity);
        System.out.println(p.Pcategory);
        
        
        
     System.out.println("\n\n**************Paramitrize constructor***********\n");
		
		
        Product p2=new Product(2,"Fan","machine",2000,2,"Electronics");
        System.out.println(p2.Pid);
        System.out.println(p2.Pname);
        System.out.println(p2.PDescription);
        System.out.println(p2.Pprice);
        System.out.println(p2.Quantity);
        System.out.println(p2.Pcategory);
        
        
      System.out.println("\n\n**************Getter Setter Methods***********\n");
		
		
        Product p3=new Product();
        
        p3.setPid(3);
        System.out.println(p3.getPid());
      
        p3.setPname("Mobile");
        System.out.println(p3.getPname());
        
        p3.setPDescription("SmartDevice");
        System.out.println(p3.getPDescription());
        
        p3.setPprice(100000);
        System.out.println(p3.getPprice());
        
        p3.setQuantity(6);
        System.out.println(p3.getQuantity());
        
        p3.setPcategory("Apple");
        System.out.println(p3.getPcategory());
        
        
    }
}
