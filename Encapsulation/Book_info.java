package Encapsulation;

public class Book_info 
{

	public static void main(String args[])
	{
		System.out.println("**************Non-Paramitrize constructor***********\n");
		
		
        Book s=new Book();
        System.out.println(s.BookId);
        System.out.println(s.Btitle);
        System.out.println(s.Bauthor);
        System.out.println(s.Bprice);
        System.out.println(s.Bpublication_year);
        System.out.println(s.Bpublisher);
        
        
        
     System.out.println("\n\n**************Paramitrize constructor***********\n");
		
		
        Book s2=new Book(21,"java","kiran","pratibha",22500,2022);
        System.out.println(s2.BookId);
        System.out.println(s2.Btitle);
        System.out.println(s2.Bpublisher);
        System.out.println(s2.Bauthor);
        System.out.println(s2.Bprice);
        System.out.println(s2.Bpublication_year);
        
        
      System.out.println("\n\n**************Getter Setter Methods***********\n");
		
		
       Book s3=new Book();
    		   
        s3.setBookId(301);
        System.out.println(s3.getBookId());
      
        s3.setBtitle("mahabharat");
        System.out.println(s3.getBtitle());
        
        s3.setBauthor("Krishna");
        System.out.println(s3.getBauthor());
        
        s3.setBprice(20000);
        System.out.println(s3.getBprice());
        
        s3.setBpublisher("iskon");
        System.out.println(s3.getBpublisher());
        
        s3.setBpublication_year(1920);
        System.out.println(s3.getBpublication_year());
        
        
    }
}
