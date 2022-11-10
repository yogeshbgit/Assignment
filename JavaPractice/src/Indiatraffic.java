
public class Indiatraffic implements centraltraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		centraltraffic cf = new Indiatraffic();
		cf.greengo();
		cf.redstop();
		cf.yellowwait();
		
		Indiatraffic us = new Indiatraffic();
		us.usatraffic();
		
	}
	public void usatraffic()
	{
		System.out.println("usa traffic");
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green go impliment");
		
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("red stop impliment");
	}

	@Override
	public void yellowwait() {
		// TODO Auto-generated method stub
		System.out.println("Yellow wait impliment");
		
	}

}
