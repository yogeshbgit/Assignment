package AssignmentTesting;

public class oopsConcepts {

	static String name,school,city;
	static int rollNo ;
	
	public oopsConcepts(String nm,String ct,String sc,int roll) {
		this.name=nm;
		this.city= ct;
		this.school = sc;
		this.rollNo = roll;
		System.out.println("Name : "+name+ ", Roll No : "+rollNo+", City : "+city+", School : "+school );
	}
	
	public  static void display()
	{
		System.out.println("Name : "+name+ ", Roll No : "+rollNo+", City : "+city+", School : "+school );
	}
	
	
	public static void main(String[] args) {
		oopsConcepts op = new oopsConcepts("Yogesh","Solapur","SambhajiRao Shinde high School",105);
		op.display();
	}
}
