import java.util.Scanner;

/*
 * Write a program that reads in a number from the user and then displays the Hailstone sequence for
that number. The problem can be expressed as follows:
 Pick some positive integer and call it n.
 If n is even, divide it by two.
 If n is odd, multiply it by three and add one.
 Continue this process until n is equal to one.
 * 
 */
public class hailstoneSequence 
{
	
	public static void main(String[] args) 
	{
		int n,c=0,val;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
//		val=n;
		
		while(n!=1)
		{
			val=n;
			if(n%2==0)
			{
				n=n/2;
				System.out.println(val+ " is even so i take half: "+n);
				c++;
			}
			else
			{
			n=n*3+1;
			System.out.println(val+ " is odd so i make 3n+1 : "+n);
			c++;
		}
			
	}
		System.out.println("there are total "+c+ "steps to reach 1");
		

	}
}

