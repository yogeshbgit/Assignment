package practice;


class Base
{
	public void mehtod1()
	{
		System.out.println("superclass");
	}
}

class Derrived extends Base
{
	public void mehtod1()
	{
		System.out.println("subclass");
	}
}
public class overriding {
	
	public static void main(String[] args) {
		Derrived bs = new Derrived();
		bs.mehtod1();
	}

}
