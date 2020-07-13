/*
Write an application to store ‘N’ numbers of type integers and sort it using below explained logic
(Bubble sort). Your program should display the sorted numbers in a formatted way
Example: Let us take the array of numbers "5 1 4 2 8", and sort the array from lowest number to
greatest number using bubble sort. In each step, elements written in bold are being compared. Three
passes will be required.
*/
public class bubblesort
{  
    public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(arr[j-1] > arr[j])
                          {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={5,4,1,2,8};  
                 bubbleSort(arr);
                
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  