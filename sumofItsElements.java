/*
 * 
 * 1st method done using varibles
 
class addElements
{
	public int add(int ...n)
	{
		int sum=0;
		for(int i:n)
		{
			sum=sum+i;
		}
		return sum;
	}
}
public class sumofItsElements {

	public static void main(String[] args) 
	{
		addElements ad = new addElements();
		System.out.println(ad.add(5,4,2,3,4,6));
		
	}
		
		
}

*/

/////////using arrays//////
public class sumofItsElements {

	public static void main(String[] args) 
	{
		int [] a=new int[]{1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of its elements= "+sum);
	}
	
	}
