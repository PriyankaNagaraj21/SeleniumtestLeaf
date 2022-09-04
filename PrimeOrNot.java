package week1.day1;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8;
		int count=0;
		
		for (int i=2;i<=n-1;i++) 
		{
			//System.out.println(n);
			if(n%i==0)
			
				count=count+1;
				
			
		}
			
		
		
		if(count==0) {
			System.out.println("is a prime number");}
			else {
				System.out.println("is not a prime");
				
			}
		
				
			
		}

	}


