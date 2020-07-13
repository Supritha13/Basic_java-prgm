/*
 * Triplets are a set of three similar things.
Complete the function to print all the triplets <A, B, C> such that A+B = C
void printTriplets(int[ ] data) {
}
Example Sample Input Sample Output
1
data ={2,3,4,5,7} <2,3,5>
<2,5,7>
<3,4,7> 
 */

import java.util.Scanner;
class Triplets{ 
static void findTriplets(int[] arr, int n) 
{ 
	boolean found = true; 
	for (int i=0; i<n-2; i++) 
	{ 
		for (int j=i+1; j<n-1; j++) 
		{ 
			for (int k=j+1; k<n; k++) 
			{ 
				if (arr[i]+arr[j]== arr[k]) 
				{ 
					System.out.print(arr[i]); 
					System.out.print(" "); 
					System.out.print(arr[j]); 
					System.out.print(" "); 
					System.out.print(arr[k]); 
					System.out.print("\n"); 
					found = true; 
				} 
			} 
		} 
	} 
if (found == false) 
		System.out.println(" not exist "); 
} 
public static void main(String[] args) 
{ 
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the Size of array");
	int n=obj.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=obj.nextInt();
		
	}
	findTriplets(arr, n);
	obj.close();
} 
} 