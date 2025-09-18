package Array;
import java.util.*;
public class Non_Alphabets 
{
  public static void main(String args[])
  {
	  char Symbols[]=new char[10];
	  Scanner s=new Scanner(System.in);
	  for(int i=0;i<Symbols.length;i++)
	  {
		  System.out.println("Enter Symbols: ");
		  Symbols[i]=s.next().charAt(0);
	  }
	  for(int i=0;i<Symbols.length;i++)
	  {
		  if(!((Symbols[i]>='A' && Symbols[i]<='Z') || (Symbols[i]>'a' && Symbols[i]<='z')))
			  Symbols[i]=' ';
	  }
	  System.out.println("\n\nEnterd Symbols are: \n");
	  for(int i=0;i<Symbols.length;i++)
	  {
		  System.out.print(Symbols[i]);
	  }
  }
}
