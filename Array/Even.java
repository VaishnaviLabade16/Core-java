package Array;
import java.io.*;
import java.util.*;
public class Even 
{
 public static void main(String args[])
 {
	 int n[]=new int[5];
	 int sum=0;
	
	 Scanner sc=new Scanner(System.in);	 
	 System.out.println("Enetr 5 numbers: ");
	  for(int i=0;i<5;i++)
	  {
	    n[i]=sc.nextInt();
	  }
	  for(int i=0;i<5;i++)
	  {
		  if(n[i]%2==0)
		  {
	       sum=sum+n[i];
		  }
	  }
	  System.out.println("\n\n Sum: "+ sum);
 }
}
