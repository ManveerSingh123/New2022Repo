package Bank;

public class Loops {
	int x=5;
	public void getWhile() {
		while(x<=10) {
			System.out.println(x);
			x++;
		}
		System.out.println("ok While ");
		System.out.println();
	}
	public void getDo() {
		do {
			System.out.println(x);
			++x;
		}
		while(x<=10);
			System.out.println("OK Do While");
			System.out.println();	
	}
	public void getFor()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		//	System.out.println();
		}	
		int id[]= {4,3,5,7,22,6};
		for(int e=0; e<6 ;e++) {
			System.out.println(id[e]);
		}
	}
	public void geForEachLoop()
	{
		int id[]= {4,3,5,7,22,6};
		String name[]= {"Ram" , "Laxman","Manav"};
		for(int e : id)
			{
			System.out.println(e);	
		}
		for(String nm : name) {
			System.out.println(nm);
		}
	}
	public static void main(String args [])
	{
		Loops obj=new Loops();
	//	obj.getWhile();
	//	obj.getDo();
	//	obj.getFor();
		obj.geForEachLoop();
	}
	}

