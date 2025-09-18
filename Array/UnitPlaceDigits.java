package Array;

import java.util.Scanner;

public class UnitPlaceDigits 
{
  public static void main(String args[])
  {
	  int n[]=new int[5];
		 
		
		 Scanner sc=new Scanner(System.in);	 
		 System.out.println("Enetr 5 numbers: ");
		  for(int i=0;i<5;i++)
		  {
		    n[i]=sc.nextInt();
		  }
		  for(int i=0;i<5;i++)
		  {
			  int unitplace=n[i]/10;
			  System.out.println("Umit place Digit: "+unitplace);
		  }
    }
}
