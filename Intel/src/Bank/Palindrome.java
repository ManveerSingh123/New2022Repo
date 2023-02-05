package Bank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args [])
	{
		String a,b;
		StringBuffer sb;
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the string for check palindrome");
		
		a=sc.nextLine();
		sb=new StringBuffer(a);
		b=sb.reverse().toString();
		
		if(a.equals(b)) {
			System.out.println("Entered string is palindrome");
		}
		else
		{
			System.out.println("Entered string is not palindrome");
		}
		
	}
}
