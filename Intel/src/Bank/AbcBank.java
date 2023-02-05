package Bank;

public class AbcBank extends RBIBank{
	
	public static void main(String args [])
	{
		AbcBank c=new AbcBank();
		c.account();
		c.intrest();
	}

	@Override
	public void intrest() {
		System.out.println("8% of intrest");
		
	}

}
