package Array;
import java.util.*;
public class Tabel_of_each_arr_element 
{
  public static void main(String args[])
  {
	  int n[] = {8, 1, 2, 4, 3, 7, 6, 9, 5, 12};
		
		for (int i = 0; i < n.length; i++) 
		{
			
			for (int j = 1; j <= 10; j++)
				System.out.print((n[i] * j) + " ");
			
			System.out.println();
		}
  }
}
