import java.util.Scanner;

/*
 * Write a program that accepts an integer as input and prints the table of that integer up to 12. For
example, is the user enters 7, the output should be:
7 x 1 = 7
7 x2 = 14
.....
7 x 12 = 84
 * 
 */
public class tables 
{

	public static void main(String[] args) 
	{
		int value,ans;
		Scanner sc=new Scanner(System.in);
		value=sc.nextInt();
		for(int i=1;i<=12;i++)
		{
		ans=value*i;	
		
		System.out.println(value+" * " +i+ " = "+ans);
		}
		
		

	}

}
