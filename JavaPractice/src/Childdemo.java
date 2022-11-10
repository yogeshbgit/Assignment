
public class Childdemo extends Parentdemo {

	String name="sachin";
	public void getname(int a,int b)
	{
		super.getname();
		int c = a+b;
		System.out.println(c);
		//System.out.println(super.name);
	}
	public Childdemo()
	{
		super(); //we can call constructor like this 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Childdemo cd = new Childdemo();
		cd.getname(4,5);
				
	}

}
