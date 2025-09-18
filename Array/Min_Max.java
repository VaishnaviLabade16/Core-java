package Array;
import java.util.*;
public class Min_Max 
{
  public static void main(String args[])
  {
	  int num[] = new int[10];
		int min, max;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < num.length; i++) {
			num[i] = s.nextInt();
		}
		min = num[0];
		max = num[0];
		
		for (int i = 0; i < num.length; i++) {
				if(num[i] > max)
					max = num[i];
				
				if(num[i] < min)
					min = num[i];
		}
		
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
  }
}
