package Array;

import java.util.Scanner;

public class Average_odd 
{
  public static void main(String args[]) 
  {
	  int n[]=new int[5];
		 int sum=0,count=0;
		 float average;
		
		 Scanner sc=new Scanner(System.in);	 
		 System.out.println("Enetr 5 numbers: ");
		  for(int i=0;i<5;i++)
		  {
		    n[i]=sc.nextInt();
		  }
		  for(int i=0;i<5;i++)
		  {
			  if(n[i]%2==1)
			  {
		       sum=sum+n[i];
		       count++;
			  }
		  }
		  
		  if(count == 0) {
		        System.out.println("No odd numbers found in the array.\n");
		    } else {
		        average = (float)sum / count;
		        System.out.println("Average of odd numbers = "+ average);
		    }

		  //System.out.println("\n\n Average: "+ Avg);
	  
  }
}
