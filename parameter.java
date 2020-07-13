/*
 * : Use arrays to structure the raw data and to perform data comparison &
operations
Write a method that receives a name as parameter and prints on the console. “Hello, <name>!”
Example
Input Output
Peter Hello, Peter!

 * 
 */
import java.util.*;

public class parameter
{
	public static void print(String name)
	{
		System.out.println("Hello, "+name+"!");
	}
	public static void main(String[] args)
	{
//	System.out.print("Enter the String  :");
	Scanner obj=new Scanner(System.in);
	String name=obj.nextLine();
	parameter.print(name);
	obj.close();
	}
}
