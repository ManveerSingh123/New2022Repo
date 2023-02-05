package Bank;

public class DevPolymor extends Polymor2Employee {
	
	
	public void display()
	{
		super.display();
		System.out.println(" Dev emp detail");
	}
	
	public static void main(String args [])
	{
		DevPolymor d=new DevPolymor();
		d.display();
	}

}
