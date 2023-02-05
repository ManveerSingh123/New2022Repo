package Bank;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args [])
	{
		ArrayList a=new ArrayList();
		System.out.println(a);
		
		a.add(44);
		a.add("Ram");
		a.add(44);
		a.add(7);
		a.add(true);
		
		System.out.println(a);
		
		a.add(1, "Singh");
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
