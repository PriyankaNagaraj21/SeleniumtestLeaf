package week1.day2;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Company="tEsTlEaF";// t,e,s,t,l,e,a,f
		
		 char[] charArray = Company.toCharArray();
		
		for(int i=0;i<=charArray.length;i++) {
			
			if(i%2!=0) {
				char upp = Character.toUpperCase(charArray[i]);
			
			System.out.println(upp);
		}
		
			else {
				System.out.println(charArray[i]);
			}
		

	}

}
}