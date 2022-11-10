
public class Parentdemo {
	
	String name="yogesh";
	public void getname()
	{
		System.out.println("this is parent getname");
	}
	public Parentdemo()
	{
		System.out.println("this is parent constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentdemo pd = new Parentdemo();
		pd.getname();
	}

}
