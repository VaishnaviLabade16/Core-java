package Array;
import java.io.*;
import java.util.*;
public class Demo 
{
  public static void main(String args[])
  {
	  int numbers[]=new int[5];
	 Scanner sc = new Scanner(System.in);
	  System.out.println("Enter 5 numbers: ");
	    for(int i=0;i<numbers.length;i++)
	    	numbers[i]=sc.nextInt();
	    System.out.println("\n\n******Output**********\n");
	    for(int i=0;i<numbers.length;i++)
	    	System.out.println(numbers[i]);
  }
}
