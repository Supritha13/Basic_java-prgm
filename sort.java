/*
Write a program which sorts ‘N’ array of Strings in an ascending order.
Note: Write two methods:
a) First method: sort using bubble sort
b) Second Method: sort using insertion sort
 */
import java.util.Arrays;
import java.util.Scanner;
public class sort {
	public static void BubbleSort(String[]a) {
		int n;
		String temp;
		n=a.length;
		for(int i=0;i<n-1;i++) 
		{
			for(int j=0;j<n-1-i;j++) 
			{
				if(a[j].compareTo(a[j+1])>0) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		System.out.println("Output of Bubble Sort");
		System.out.println(Arrays.toString(a));
	}
public static void InsertionSort(String[]a) {
	for(int i = 1; i < a.length; i++){
	    String value = a[i];
	    int j = i - 1;
	    while(j >= 0 && a[j].compareTo(value)>0){
	      a[j + 1] = a[j];
	      j = j - 1;
	    }
	    a[j + 1] = value;
	  }
	System.out.println("Output of Insertion Sort");
	System.out.println(Arrays.toString(a));

	}
public static void main(String[] args) {
	Scanner obj=new Scanner(System.in);
	int size;
	System.out.println("Enter the size of array");
	size=obj.nextInt();
	String[] a= new String[size];
	String[] b= new String[size];
	System.out.println("Enter the Elements of array");
	for(int i=0;i<size;i++) {
		a[i]=obj.next();
	}
	for(int i=0;i<size;i++) {
		b[i]=a[i];
	}
	sort.BubbleSort(a);
	sort.InsertionSort(b);
	obj.close();
}
}