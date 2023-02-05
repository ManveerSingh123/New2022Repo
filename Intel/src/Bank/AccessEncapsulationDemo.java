package Bank;

public class AccessEncapsulationDemo  {
	
	public static void main(String args [])
	{
		EncapculationDemo c1=new EncapculationDemo();
		System.out.println(c1.username);
		c1.username="Manav";
		System.out.println(c1.username);
		
		System.out.println(c1.getPassword());
		c1.setPassword("Singh");
		System.out.println(c1.getPassword());
	}

}
