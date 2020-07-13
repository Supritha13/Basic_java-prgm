/*
 * Create a method GetMax(int a, int b, int c), that returns maximal of three numbers. Write a program
that reads three numbers from the console and prints the biggest of them.
dInputArray1[] 10.0 20.0 30.0
dInputArray2[] 20.0 50.0 30.0 70.0 80.0
Programming Fundamentals - Practice Problems
© Mindtree 2020 Page 5
Examples
Input Output  Input   Output
1      3	  -101     -100
2			  -102
3             -100
*/
import java.util.*;

public class max
{
	public void GetMax(int a, int b, int c)
	{
		int res=c > (a > b ? a : b) ? c : ((a > b) ? a : b);
	System.out.println(res);	
	}
public static void main(String[] args) 
	{
		Scanner obj =new Scanner(System.in);
		int a=obj.nextInt();
		int b=obj.nextInt();
		int c=obj.nextInt();
		max res=new max();
		res.GetMax(a, b, c);	
	}

}
