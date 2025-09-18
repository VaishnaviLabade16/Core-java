package Array;

public class unique_element
{
  public static void main(String args[])
  {
	  int n[] = {8, 1, 0, 8, 3, 7, 6, 2, 5, 3};
		int count = 0;
		
		for (int i = 0; i < n.length; i++) 
		{
			
			for (int j = 0; j < n.length; j++) 
			{
				if(n[i] == n[j])
					count++;
			}
			
			if(count == 1)
				System.out.println(n[i]);
			
			count = 0;
		}
  }
}
