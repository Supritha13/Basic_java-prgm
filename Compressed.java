/*
 * Let us design a simple compression algorithm where only the frequency of individual letters is used to
compress the data. For e.g., the string Aabcccccaaa would become a2b1c5a3. The compression
logic should be applied only when the total length of the compressed string is less than the original
string. For the purpose of compression logic, the case sensitiveness is not considered. For e.g. A and
a are considered the same.
Input
A String that needs to be compressed is given. Given string always contains characters. The string
may contain characters in upper as well as lower case.
Output
Output is the compressed string or the same string if the compressed string length is more than or
equal to the length of the original string. Output contains string in lowercase always.
Input: aAbcccccaaA   output: a2b1c5a3
Input: BBBBbbb 		 output: b7

 * 
 */
import java.util.Scanner;

class Compressed { 
	static void Comp(String s) 
	{ 
		for (int i = 0; i < s.length(); i++) { 
			int count = 1; 
			while ((i+1<s.length()&&(s.charAt(i)==(s.charAt(i+1)-32)||s.charAt(i)==(s.charAt(i+1)+32))||
					(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)))) { 
				i++; 
				count++; 
			}
			System.out.print(s.charAt(i)+""+count); 
		} 

		System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		Scanner obj= new Scanner(System.in);
		String a=obj.next();
		int len=a.length();
		char[]use=new char[len];
		for(int i=0;i<len;i++)
			use[i]=a.charAt(i);
		for(int i=0;i<len;i++)
		if(use[i]>='A' && use[i]<='Z')
        { 
			use[i]=(char)((int)use[i]+32);
        }
		String str = String.valueOf(use);
		Compressed.Comp(str);
		obj.close();
	} 
} 
