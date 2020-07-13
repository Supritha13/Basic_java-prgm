import java.util.Scanner;

/*
Write a menu driven program to implement binary search algorithm on both integer elements and
strings.
Menu:
1. Binary search for Integer elements
2. Binary search for Strings
3. Exit
Write two methods:
a) Boolean findElement(int arr [], int key): Should return ‘true’ if key element found otherwise
‘false’
b) Boolean findString(String names[], String name): Should return ‘true’ if name found in the
list otherwise 'false'.
*/
import java.util.Scanner;
public class binarySearch 
{
	public static boolean findElement(int arr[], int key) 
	{
		int size=arr.length;
		int low,high,mid;
		low = 0;
		high = size - 1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] == key)
				return true;
			else if (arr[mid] > key) {
				high = mid - 1;

			}	else
		low=mid+1;
	}
	return false;
	}
	public static boolean findString(String[] names, String name) {
		int size=names.length;
		int low,high,mid;
		low=0;
		high=size-1;
		while(low<=high) {
		mid=(low+high)/2;
		 int res = name.compareTo(names[mid]);
		 if (res == 0) 
             return true;  
		 else if (res > 0) 
             low = mid + 1;  
         else
             high = mid - 1; 
		}
		return false;
	}
	public static void main(String[] args) {
		int choice;
		System.out.println("Enter the choice \n 1. Binary search for Integer elements \n 2. Binary search for Strings \n 3. Exit");
		Scanner s= new Scanner(System.in);
		choice=s.nextInt();
		while(true) {
			switch(choice){
				case 1:
					System.out.println("Enter the size of array for integer array");
					int size=s.nextInt();
					int a[]= new int[size];
					System.out.println("Enter the array elements");
					for(int i=0;i<size;i++) {
						a[i]=s.nextInt();
					}
					System.out.println("Enter the search key");
					int search=s.nextInt();
					boolean result=binarySearch.findElement(a, search);
					System.out.println(result);		
					System.exit(0);
				case 2:
				System.out.println("Enter the size of array for string array");
				int stringsize=s.nextInt();
				String[] a1= new String[stringsize];
				System.out.println("Enter the array names");
				for(int i=0;i<stringsize;i++) {
					a1[i]=s.next();
				}
				System.out.println("Enter the search name");
				String search1=s.next();
				boolean result1=binarySearch.findString(a1, search1);
				System.out.println(result1);		
				System.exit(0);
				case 3:System.out.println("Exit");
						System.exit(0);
				default:System.out.println("Wrong Choice Enter Again");
						choice=s.nextInt();
						
			}
		}
	}
}
