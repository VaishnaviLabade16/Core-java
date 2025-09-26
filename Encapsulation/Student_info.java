package Encapsulation;

public class Student_info {

	public static void main(String args[])
	{
		System.out.println("**************Non-Paramitrize constructor***********\n");
		
		
        Student s=new Student();
        System.out.println(s.Srollno);
        System.out.println(s.Sname);
        System.out.println(s.Scourse);
        System.out.println(s.CGPA);
        System.out.println(s.Ssemester);
        System.out.println(s.Saddress);
        
        
        
     System.out.println("\n\n**************Paramitrize constructor***********\n");
		
		
        Student s2=new Student(2,"vaishnavi","Mcs",999,6,"kiwale");
        System.out.println(s2.Srollno);
        System.out.println(s2.Sname);
        System.out.println(s2.Scourse);
        System.out.println(s2.CGPA);
        System.out.println(s2.Ssemester);
        System.out.println(s2.Saddress);
        
        
      System.out.println("\n\n**************Getter Setter Methods***********\n");
		
		
       Student s3=new Student();
        
        s3.setSrollno(3);
        System.out.println(s3.getSrollno());
      
        s3.setSname("sarika");
        System.out.println(s3.getSname());
        
        s3.setScourse("Bca");
        System.out.println(s3.getScourse());
        
        s3.setCGPA(100);
        System.out.println(s3.getCGPA());
        
        s3.setSsemester(5);
        System.out.println(s3.getSsemester());
        
        s3.setSaddress("Pune");
        System.out.println(s3.getSaddress());
        
        
    }
}
