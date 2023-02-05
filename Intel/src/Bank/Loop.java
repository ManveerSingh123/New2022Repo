package Bank;

public class Loop {
	
	public void forloop()
	{
	
	for(int i=0;i <10; i++) {
		
		System.out.println(i);
	}
	
	}
	
	public void foreachLoop()
	{
		int id[]= {4,5,7,22,6};
		String nm[]= {"MM","NN","OO"};
		for(String e: nm)
			
		{
			System.out.println(e);
		}
	}
	
	public static void main (String args [])
	{
		Loop l1=new Loop();
		l1.forloop();
		l1.foreachLoop();
	}

}
