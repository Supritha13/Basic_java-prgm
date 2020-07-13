/*
Write a program that can calculate the area of four different geometry figures - triangle, square,
rectangle and circle.
On the first line you will get the figure type. Next you will get parameters for the chosen figure,
each on a different line:
 Triangle - side and height
 Square - side
 Rectangle - width and height
 Circle - radius
The output should be rounded to the second digit after the decimal point:
Examples
Input Output
triangle
3
6
9.00
rectangle
4
5
20.00    */

import java.util.Scanner;

public class area {
	public static void main (String[] args) {
	float w,h,r,s;
	float area=(float) 0.00;
	Scanner obj = new Scanner(System.in);
	System.out.print("Figure type: ");
	String shape = obj.nextLine();
	switch(shape){
		case "Triangle":
			System.out.print("enter height: ");
			h=obj.nextInt();
			System.out.print("enter side: ");
			s=obj.nextInt();
			area=(float)0.5*h*s;
						break;
		case "Rectangle":
			System.out.print("enter width: ");
			w=obj.nextInt();
			System.out.print("enter height ");
			h=obj.nextInt();
						area=(float)w*h;
						break;
		case "Square":
			System.out.print("enter side: ");
			s=obj.nextInt();
						area=(float)s*s;
						break;
		case "Circle":
			System.out.print("enter radius: ");
			r=obj.nextFloat();
			area=(float) (3.14*r*r);
						break;
		default:System.out.println("Wrong Choice");
	}
	if((float)area>0)
	System.out.println(area);
	obj.close();
	}
}