package Array;
import java.util.*;
public class Even_Odd 
{
  public static void main(String args[])
  {
	  int main[] = new int[10];
		int evens[] = new int[10];
		int odds[] = new int[10];
		int e = 0, o = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers: ");
		for (int i = 0; i < main.length; i++) {
			main[i] = s.nextInt();
		}
		
		for (int i = 0; i < main.length; i++) {
				if(main[i]%2 == 0)
					evens[e++] = main[i];
				else
					odds[o++] = main[i];
		}
		
		System.out.println("Main is: ");
		for (int i = 0; i < main.length; i++)
			System.out.println(main[i]);
		
		System.out.println("Evens are: ");
		for (int i = 0; i < e; i++)
			System.out.println(evens[i]);
		
		System.out.println("Odds are: ");
		for (int i = 0; i < o; i++)
			System.out.println(odds[i]);

  }
}
