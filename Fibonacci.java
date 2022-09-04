package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		int FirstNum = 0;
		int SecNum =1;
		int n=11;
		int sum;{
		System.out.println(FirstNum+ " " + SecNum);
		
		for (int i=2;i<n;i++) {
			 sum = FirstNum+SecNum;
			 System.out.println(sum);
			 FirstNum=SecNum;
			 SecNum=sum;
		
			
		}
		
		// TODO Auto-generated method stub

	}

}
}
