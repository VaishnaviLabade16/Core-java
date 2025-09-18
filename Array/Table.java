package Array;
import java.util.*;
public class Table 
{
	public static void main(String args[])
	{
	int num[] = new int[10];
	int n;
	
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter a number: ");
	n = s.nextInt();
	
	for (int i = 0; i < num.length; i++)
		num[i] = n * (i+1);
	
	for (int i = 0; i < num.length; i++)
		System.out.println(num[i]);
     }
}