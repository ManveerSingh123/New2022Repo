package Bank;

public class ExceptionDemo {
	public static void main(String args [])
	{
		try {
		int id[]= {2,3,4};
		System.out.println(id[0]);
		System.out.println(id[1]);
		System.out.println(id[2]);
		System.out.println(id[3]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		int x=88;
		int y=0;
		System.out.println(x/y); // Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		
		String custname=null;
		System.out.println(custname.length()); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "custname" is null
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("done");
		
		
	}
	

}
