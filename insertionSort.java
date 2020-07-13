/*
 * Write a method which accepts array of unsorted integer elements and display elements in sorted
order. Use insertion sort algorithm to sort.
 */
import java.util.Scanner;
public class insertionSort
{ 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            int key = arr[i]; 
            int j = i - 1; 
   while (j >= 0 && arr[j] > key) { 
                arr[j + 1] = arr[j]; 
                j = j - 1; 
            } 
            arr[j + 1] = key; 
        } 
    } 
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
  
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        Scanner s=new Scanner(System.in);
        System.out.println("enter size: ");
        int size=s.nextInt();
        System.out.println("enter array elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
        	arr[i]=s.nextInt();
        }
        	
        insertionSort ob = new insertionSort(); 
        ob.sort(arr); 
  
        printArray(arr); 
    } 
}