package Encapsulation;

public class Student {

    public int Srollno;
    public String Sname;
    public String Scourse;
    public int Ssemester;
    public int CGPA;
    public String Saddress;
    
    //Non-Paramitrize Counstructor
    Student()
   {
   	 Srollno=1;
   	 Sname="kARINA";
   	 Scourse="Bcs";
   	 Ssemester=5;
   	 CGPA=10;
   	 Saddress="Bijlinagar";
   }
    
    
    //Paramiterize Constructor
    Student(int Srollno, String Sname, String Scourse ,int Ssemester ,int CGPA,String Saddress)
    {
	   this.Srollno=Srollno;
	   this.Sname=Sname;
	   this.Scourse=Scourse;
	   this.Ssemester=Ssemester;
	   this.CGPA=CGPA;
	   this.Saddress=Saddress;
    }
    

    public int getSrollno()
    {
   	 return Srollno;
    }
    public void setSrollno(int Srollno)
    {
   	 this.Srollno=Srollno;
    }
    
    public String getSname()
    {
   	 return Sname;
    }
    public void setSname(String Sname)
    {
   	 this.Sname=Sname;
    }
    
    public String getScourse()
    {
   	 return Scourse;
    }
    public void setScourse(String Scourse)
    {
   	 this.Scourse=Scourse;
    }
    
    public int getSsemester()
    {
   	 return Ssemester;
    }
    public void setSsemester(int Ssemester)
    {
   	 this.Ssemester=Ssemester;
    }
    
    public int  getCGPA()
    {
   	 return CGPA;
    }
    public void setCGPA(int CGPA)
    {
   	 this.CGPA=CGPA;
    }
    
    public String getSaddress()
    {
   	 return Saddress;
    }
    public void setSaddress(String Saddress)
    {
   	 this.Saddress=Saddress;
    }
    
    
	/* public int BookId;
     public String Btitle;
     public String Bauthor;
     public String Bpublisher;
     public int Bprice;
     public int Bpublication_year;
     
     //Non-Paramitrize Counstructor
     Book()
    {
    	 BookId=1;
    	 Btitle="Data Analyatics";
    	 Bauthor="xyz";
    	 Bpublisher="nirali";
    	 Bprice=108;
    	 Bpublication_year = 2019;
    }
     
     
     //Paramiterize Constructor
     Book(int BookId, String Btitle, String Bauthor ,String Bpublisher,int Bprice,int Bpublication_year)
     {
 	   this.BookId=BookId;
 	   this.Btitle=Btitle;
 	   this.Bauthor=Bauthor;
 	   this.Bpublisher=Bpublisher;
 	   this.Bprice=Bprice;
 	   this.Bpublication_year=Bpublication_year;
     }
     

     public int getBookId()
     {
    	 return BookId;
     }
     public void setBookId(int BookId)
     {
    	 this.BookId=BookId;
     }
     
     public String getBtitle()
     {
    	 return Btitle;
     }
     public void setBtitle(String Btitle)
     {
    	 this.Btitle=Btitle;
     }
     
     public String getBauthor()
     {
    	 return Bauthor;
     }
     public void setBauthor(String Bauthor)
     {
    	 this.Bauthor=Bauthor;
     }
     
     public String getBpublisher()
     {
    	 return Bpublisher;
     }
     public void setBpublisher(String Bpublisher)
     {
    	 this.Bpublisher=Bpublisher;
     }
     
     public int  getBprice()
     {
    	 return Bprice;
     }
     public void setBprice(int Bprice)
     {
    	 this.Bprice=Bprice;
     }
     
     public int getBpublication_year()
     {
    	 return Bpublication_year;
     }
     public void setBpublication_year(int Bpublication_year)
     {
    	 this.Bpublication_year=Bpublication_year;
     }*/
}
