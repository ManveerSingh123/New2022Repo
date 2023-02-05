package Bank;

public class ExceptionHandleTryCatch {
	
	public static void main(String args [])
	{
		try {
			int id[]= {2,3,4};
			System.out.println(id[0]);
			System.out.println(id[1]);
			System.out.println(id[2]);
			System.out.println(id[3]); // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		}
			catch(ArrayIndexOutOfBoundsException e)
		  // catch(Exception e)

			{
				e.printStackTrace();
			}
		
		
		System.out.println("Handled ArrayIndexOutOfBoundsException ");
			try {
			int x=88;
			int y=2;
			System.out.println(x/y); // Exception in thread "main" java.lang.ArithmeticException: / by zero
			}
			catch(ArithmeticException e)
		//	catch(Exception e)

			{
				e.printStackTrace();
			}
			finally {
				System.out.println("finally block");
			}
			System.out.println("Handled ArithmeticException ");
			try {
			String custname=null;
			System.out.println(custname.length()); // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "custname" is null
			}	
			catch(NullPointerException e)

		//	catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("Handled NullPointerException ");
			System.out.println("done");
			
			
		}
}	


