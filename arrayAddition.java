/*
 * Write a program which performs addition of elements which are stored in two arrays of type double.
Arrays lengths may be variable in size. The resultant values must be stored in an integer array.
Display the resultant integer array in a formatted way.
dInputArray1[] 10.0 20.0 30.0
dInputArray2[] 20.0 50.0 30.0 70.0 80.0
iSumArray[] 30 70 60 70 80
*/
import java.util.*;
public class arrayAddition
{
	public static void main(String[] args) {
	    int size1,size2;
	    Scanner sc = new Scanner(System.in);
	    size1 = sc.nextInt();
	    size2 = sc.nextInt();
	    
	    double arr1[] = new double[size1];
	    double arr2[] = new double[size2];
	    for(int i=0;i<size1;i++)
	        arr1[i] = sc.nextDouble();
	    for(int i=0;i<size2;i++)
	        arr2[i] = sc.nextDouble();
	        
	   int sum[] = new int[size2];
	   int index;
	   for(index=0;index<size1;index++)
	       sum[index] = (int) (arr1[index]+arr2[index]);
       for(int i=index;i<size2;i++)
            sum[i] = (int) arr2[i];
            
	   
	  for(int i=0;i<size2;i++) 
		System.out.print(sum[i]+" ");
	}
}
//////////****2nd method***////////////
//public class arrayAddition{
//	public static void main(String[] args) {
//		double arr[]={10,20,30};
//		double arr2[]={20,50,30,70,80};
//		int size1,size2;
//		size1=arr.length;
//		size2=arr2.length;
//		if(size1>size2) 
//		{
//			double c[]= new double[size1];
//			for(int i=0;i<size1;i++)
//			{
//				c[i]=arr[i];
//			}
//			for(int i=0;i<size2;i++)
//			{
//				c[i]=c[i]+arr2[i];
//			}
//			for(int i=0;i<size1;i++)
//			{
//				System.out.print((int)Math.round(c[i])+" ");
//			}
//		}
//		else
//		{
//			double c[]= new double[size2];
//			for(int i=0;i<size2;i++)
//			{
//				c[i]=arr2[i];
//			}
//			for(int i=0;i<size1;i++)
//			{
//				c[i]=c[i]+arr[i];
//			}
//			for(int i=0;i<size2;i++)
//			{
//				System.out.print((int)Math.round(c[i])+" ");
//			}
//		}
//	}
//}
