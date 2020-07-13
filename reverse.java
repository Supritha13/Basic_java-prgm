import java.util.Scanner;

/*
 * Write a method that prints the digits of a given decimal number in a reversed order.
Examples
Input Output
256 652
 * 
 */
import java.util.Scanner;
public class reverse 
{
	public static void main(String[] args) 
	{
		int num,rev=0,temp;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		 while(num != 0) {
	            temp = num % 10;
	            rev = rev * 10 + temp;
	            num /= 10;
	        }
		 System.out.println(rev);
		
		
	}

}
