package Bank;

import java.util.ArrayList;
import java.util.HashSet;

public class HasSetDemo {

	public static void main(String args [])
	{
		HashSet a=new HashSet();
		System.out.println(a);
		
		a.add(44);
		a.add("Ram");
		a.add(44);
		a.add(7);
		a.add(true);
		
		System.out.println(a);
		
		
		
		for(Object e: a)
		{
		 System.out.println(e);
		}
		System.out.println("Size of ArrayList is : " + a.size());
		a.remove(3);
		System.out.println(a);
	}
}
