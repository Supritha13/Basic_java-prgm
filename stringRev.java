/*
Given a sentence which consists of alphabets [a-zA-Z], digits [0-9], “,” and “.”.
Write a method which returns a string after reversing only the alphabets [a-zA-Z] in a sentence which
is passed as an argument the method.
Note: reversing has to be done word-by-word. Example: if sentence contains “Hello World”, the
reversed sentence will be “dlroW olleH”
Example:
Input: 1 cup of hot coffee costs 8.00, whereas cold coffee costs 45.00.
output: 1 puc fo toh eeffoc stsoc 8.00, saerehw dloc eeffoc stsoc 45.00.
 */
import java.util.*;

public class stringRev 
{
	public static String Reverse(String value) {
		int len=value.length();
		char sChar = value.charAt(0);
		if (Character.isDigit(sChar)) {
		   return value;
		} 
		String rev= "";
		for (int i = len - 1 ; i >= 0 ; i--)
		rev = rev + value.charAt(i);
		return rev;
	}
    public static void main(String a[]){
    String s;
    Scanner obj=new Scanner(System.in);
    s=obj.nextLine(); 
    String delims = " ";

    StringTokenizer st = new StringTokenizer(s, delims);
    		int len=st.countTokens();                                                                                                                                                                                                                                       
            String[] array= new String[st.countTokens()];
            int i=0;
             while (st.hasMoreTokens())
             {
                array[i++]=st.nextToken();
             }
             for(int j=0;j<len;j++) {
            	 array[j]=stringRev.Reverse(array[j]);
             }
             for(int j=0;j<len;j++) {
            	 System.out.print(array[j]+" ");            	 
             }
             obj.close();
     }
}