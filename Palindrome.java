package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
String value = "madam";
char[] charArray = value.toCharArray();
String rev = "";


for (int i = charArray.length-1; i >= charArray.length-1; i--) 
{
	rev = rev+charArray[i];
	if (value.equals(rev)) 
	{
		System.out.println("Palindrome");}
		else {
			System.out.println("Not a Palindrome");
		
	}
}
	}
}





