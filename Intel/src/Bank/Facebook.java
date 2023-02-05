package Bank;

public class Facebook {

	String username="user1";
	String pswd="test123";
	
	public void login()
	{
	//	System.out.println(username);
	//	System.out.println(pswd);
	}
	
	public void logout()
	{
		System.out.println("logout done");
		
	}
	
	public void add(int a,int b)
	{
		int result=a+b;
		
		System.out.println(result);
	}

	public static void main(String args [])
	{
		Facebook obj=new Facebook();
		obj.login();
		
		System.out.println(obj.username);
		System.out.println(obj.pswd);
		
		obj.logout();
		
		obj.add(6, 7);
	}
}
