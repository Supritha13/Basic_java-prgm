/*
 * Write a Boolean method IsPrime(n) that check whether a given integer number n is prime.
Examples:
n 			   IsPrime(n)
0 			   false
1 			   false
2 			   true
3 			   true
4 			   false
5 			   true
323 		   false
337 		   true
6737626471     true
117342557809   false
 */
public class primecheck 
{
	public static boolean IsPrime(int n) 
	{
		if(n<=0)
			return false;
		for(int i=2;i<n;i++)
			if(n%i==0)
			{
				return false;
			}
		return true;

	}
	public static void main(String[] args) {
		int n;
		int val[]= {0,1,2,3,4,5,323,337,676762471};
		n=val.length;
		System.out.println("n    isPrime(n)");
		for(int i=0;i<n;i++) {
			System.out.print(val[i]+"    ");
			System.out.println(IsPrime(val[i]));	
		}
	}
}
