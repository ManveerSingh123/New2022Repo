package Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	static boolean isAnagram(String str1, String str2)
	{
		char[]w1=str1.replaceAll("[\\s]", "").toCharArray();
		char[]w2=str1.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(w1);
		Arrays.sort(w2);
		 return Arrays.equals(w1, w2);
		
	}
	public static void main(String args [])
	{
		String str1,str2;
		boolean check;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string ");
		str1=sc.nextLine();
		System.out.println("Enter the second string");
		str2=sc.nextLine();
		check=isAnagram(str1,str2);
		if(check==true)
		{
			System.out.println("' "+str1+"'and'" +str2+ "'are Anagram'");
		}
		else
		{
			System.out.println("' "+str1+"'and'" +str2+ "'are not Anagram'");
		}
	}
}

