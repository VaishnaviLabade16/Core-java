package Array;
import java.util.*;
public class Square 
{
  public static void main(String args[])
  {
	  int num[] = {8, 1, 2, 4, 3, 7, 6, 9, 5, 12};
		
		for (int i = 0; i < num.length; i++) 
		{	
			for (int j = 0; j < num.length; j++) 
			{
				if(num[j] == (num[i]*num[i]))
					System.out.println(num[i]);
			}
		}
  }
}
