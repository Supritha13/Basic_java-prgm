/*
 * Complete the method to print the consecutive characters and the number of times appearing in a
String.
void printConsecutiveCharacters(String input) {
}
Example Sample Input Sample Output
1) “I saw a CD play-er and a modem in ccd” 
CD 2
DE 1
*/
import java.util.*;
public class ConsecutiveString {
	public static void main(String[]args) {
		String x,y;
		y="";
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter String:");
		x=obj.nextLine();
		for(i=0;i<x.length();i++) {
			int ch=(int)x.charAt(i);
			if(ch>=97&&ch<=122) {
				ch=ch-32;
				y=y+(char)ch;
			}
			else {
				y=y+(char)ch;
			}		
		}
		System.out.println(y);//Checking wether the string is in the upper case or not
		printConsecutiveChars(y);
		obj.close();
	}
	static void printConsecutiveChars(String a) {
		int i,f,j=65,c=0;
		char x='0';
		char y='0';
		while(j<=90) {
			c=f=0;
			for(i=1;i<a.length();i++) {
				if((a.charAt(i-1)==(char)(j))&&(a.charAt(i)==(char)(j+1))) {
					x=a.charAt(i-1);
					y=a.charAt(i);
					c++;
					f++;
				}
			}
			if(f>0) {
				System.out.print(x);
				System.out.println(y+": "+c);
			}
			j++;
		}
		
	}
}
