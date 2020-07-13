/*
 * Write a program to calculate factorial of a number.
Example: 5! = 5*4*3*2*1.
Input:
Initialize/receive an integer value
Output:
Factorial of a given number is 120.
 * 
 */

public class factorial
{
public static void main(String[] args) 
{
	int num=5,fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
		
		
	}
}
