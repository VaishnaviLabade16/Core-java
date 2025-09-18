package Array;
import java.util.*;
public class Find_element 
{
public static void main(String args[])
{
	int num[] = new int[10];
	int toFind, count = 0;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter 10 numbers: ");
	for (int i = 0; i < num.length; i++)
		num[i] = s.nextInt();
	
	System.out.println("Enter number to search: ");
	toFind = s.nextInt();
	
	for (int i = 0; i < num.length; i++) {
		if(num[i] == toFind)
			count++;
	}
	
	if(count == 0)
			System.out.println(toFind + " Not Found!");
	else
		System.out.println(toFind + " appears " + count + " times.");

}
}
