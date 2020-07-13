/*
In an online application, a university would like to validate the university seat number (USN) entered
by its student.
Example: A sample USN looks like: 1DS09CS010
Following are the constraints to enter registration number:
 Each USN must be length of 10 characters
 1st character must be digit and have value either '1' or '2'
 2nd and 3rd characters must be upper case letters
 4th and 5th characters must be digits and can have values between 0-9
 6th and 7th characters must be upper case letters and can have combination any of following
substring: CS, IS,EC and ME.
 8th,9th and 10th characters must be digits and can have values between 0-9
 Create class called TestUSN which has main() method to:
 Initialize USN variable with string value
 Validate USN against above constraints
 Print "Success" or "Failure" message based on result of validation 
*/
import java.util.Scanner;

public class usn
{
public static void main(String[] args) 
{
	Scanner s =new Scanner(System.in);
	int count=0;
	System.out.println("ENTER USN");
	String usn=s.nextLine();
	int len=usn.length();
	if(len!=10) //bcz usn  must be length of 10 char 
	{
		System.out.println("Invalid Usn");
	}
	char[] a= new char[10];
	for(int i=0;i<10;i++) 
	{
		a[i]=usn.charAt(i);
	}
	if(a[0]=='1'||a[0]=='2')//first charcter id sigit which mus be 1 or 2
		{
		if((a[1]>='A'||a[1]<='Z')&&(a[2]>='A'||a[2]<='Z'))//upper case letters
			{
			if((Character.isDigit(a[3])==true)&&(Character.isDigit(a[4])==true))//it shud be a digit so we can use isdigit function
			{
				if((a[5]=='C'&&a[6]=='S')||(a[5]=='I'&&a[6]=='S')||(a[5]=='E'&&a[6]=='C')||(a[5]=='M'&&a[6]=='E'))//to get these combination of letters
					{
					if((a[7]>='0'||a[7]<='9')&&(a[8]>='0'||a[8]<='9')&&(a[9]>='0'||a[9]<='9'))
						{
						count=1;
					}
				}
			}
		}
	}
	if(count==0) {
		System.out.println("Failure");
	}
	else {
		System.out.println("Success");
	}
	s.close();
	}
}

//if(([7]||a[8]||a[9]>='0')||(a[7]||a[8]||a[9]<='9'))