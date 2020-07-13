/*
Write a method that calculates all prime numbers in given range and returns them as list of
integers
Write a method to print a list of integers. Write a program that takes two integer numbers (each at a
separate line) and prints all primes in their range, separated by a comma.
Examples
Start and End
Number
0-10
Output: 2, 3, 5, 7
 * 
 */
import java.util.Scanner;

public class primerange
{
	public static void main(String args[])
	{
		int start, end, count = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("Start :" );
		start = s.nextInt();
		System.out.print("end : ");
		end = s.nextInt();
		for(int i = start; i <= end; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.print(i+" ");
			}
			
		}
	}
}