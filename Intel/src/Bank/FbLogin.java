package Bank;

public class FbLogin {
	
	String username="emp1";
	String pswd="test";
	
	public void login() {
		System.out.println(username);
		System.out.println(pswd);
	}
	
	
	
public static void main(String args []) {
	
	FbLogin obj=new FbLogin();
	
	obj.login();
	
	
}

}
