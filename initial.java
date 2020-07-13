/*
 * Write a program that computes your initials from your full name and displays them.
Example: If name = “KaviArasuV”, it must record the initials as “KAV”
 * 
 */
import java.util.Scanner;

public class initial 
{
	public static void main(String[]args) 
	{
	Scanner s=new Scanner(System.in);
	String name=s.next();
	int len=name.length();//length of the name is taken
	char[] ch=new char[len];//memory for storing the initial
	for(int i=0;i<len;i++)//loop begins to check all the characters in a string
		ch[i]=name.charAt(i);
	for(int i=0;i<len;i++) {
		if(ch[i]>='A'&&ch[i]<='Z') {
		System.out.print(ch[i]);
			}
		}
	s.close();
	}
}
