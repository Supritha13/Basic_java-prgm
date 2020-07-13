/*
 * Write a method which accepts an integer array and key element to search. It should return ‘true’ if
given key element found otherwise ‘false’
*/
import java.util.Arrays; 
//import java.util.stream.IntStream; 
  
public class searchKey
{ 
    public static void check(int[] arr, int findKey) 
    { 
        boolean test = false; 
        for (int element : arr) { 
            if (element == findKey) { 
                test = true; 
                break; 
            } 
        } 
        System.out.println( test); 
    }
 public static void main(String[] args) 
    { 
        int arr[] = { 5, 1, 9, 7, 2, 6, 10 }; 
        int findKey = 17; 
        System.out.println("Array: " + Arrays.toString(arr)); 
        check(arr, findKey); 
    } 
} 
