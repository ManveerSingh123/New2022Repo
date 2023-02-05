package Bank;

public class PolymorphismDemo {
	
	public void login(String a, String b)
	{
		System.out.println("dev");
	}

	public void login(String b,int a)
	{
		System.out.println("test");
	}
	public void login(int a,String b)
	{
		System.out.println("DB env");
	}
	
	
	public static void main(String args [])
	{
		PolymorphismDemo p=new PolymorphismDemo();
		p.login(11, "Ram");
		p.login("Ram", "Singh");
		p.login("Manav", 786);
	}
}
