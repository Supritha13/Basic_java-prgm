/*
 *We have 2 student names Ali Al-Ali and Ahmed Al-Ahmed. Design and implement a Java program
that will exchange the last name of the two students in such a way that the new names are going to
be
*/
import java.util.Scanner;

public class swapname {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();//name of first person
		String b=obj.nextLine();//name of second person
		//working begins here
		String firstName=a.substring(0,a.indexOf(" "));//returns the substring which lasts till end of the string(begin index, end index-1)
        String lastName=a.substring(a.indexOf(" "));
		String firstName1=b.substring(0,b.indexOf(" "));
        String lastName1=b.substring(b.indexOf(" "));
        String swapName=firstName+" "+lastName1;
        String swapName1=firstName1+" "+lastName;
        System.out.println("After Swap");
        System.out.println(swapName);
        System.out.println(swapName1);

        obj.close();
	}

}
