package Encapsulation;

public class Product
{
     public int Pid;
     public String Pname;
     public String PDescription;
     public int Pprice;
     public int Quantity;
     public String Pcategory;
     
     //Non-Paramitrize Counstructor
     Product()
    {
	   Pid=1;
	   Pname="Pen";
	   PDescription="for writing";
	   Pprice=5;
	   Quantity=10;
	   Pcategory="Stationary";
    }
     
     
     //Paramiterize Constructor
     Product(int Pid, String Pname, String PDescription ,int Pprice ,int Quantity,String Pcategory)
     {
 	   this.Pid=Pid;
 	   this.Pname=Pname;
 	   this.PDescription=PDescription;
 	   this.Pprice=Pprice;
 	   this.Quantity=Quantity;
 	   this.Pcategory=Pcategory;
     }
     

     public int getPid()
     {
    	 return Pid;
     }
     public void setPid(int Pid)
     {
    	 this.Pid=Pid;
     }
     
     public String getPname()
     {
    	 return Pname;
     }
     public void setPname(String Pname)
     {
    	 this.Pname=Pname;
     }
     
     public String getPDescription()
     {
    	 return PDescription;
     }
     public void setPDescription(String PDescription)
     {
    	 this.PDescription=PDescription;
     }
     
     public int getPprice()
     {
    	 return Pprice;
     }
     public void setPprice(int Pprice)
     {
    	 this.Pprice=Pprice;
     }
     
     public int  getQuantity()
     {
    	 return Quantity;
     }
     public void setQuantity(int Quantity)
     {
    	 this.Quantity=Quantity;
     }
     
     public String getPcategory()
     {
    	 return Pcategory;
     }
     public void setPcategory(String Pcategory)
     {
    	 this.Pcategory=Pcategory;
     }
}
