/*
 * Write a program which generates a password for a student using his initials and age. Each student
will have first name, middle name and last name.

 */
import java.util.Scanner;
public class password 
{
	public static void main(String[]args) {
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter Name Without spaces which includes first name middle name and last name");
		String name=obj.next();
		System.out.print("Enter age:   ");
		int age=obj.nextInt();
		int l=name.length();//stores the length of name
		char[] ch=new char[l];//new storage
		char[] chcount=new char[l];
		int j=0;
		for(int i=0;i<l;i++)
			ch[i]=name.charAt(i);
		for(int i=0;i<l;i++) 
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				chcount[j++]=ch[i];
			}
		}
		System.out.print("Your Password is   ");
		for(int i=0;i<j;i++)
		System.out.print(chcount[i]);
		System.out.print(age+"!");
		obj.close();
	}
}