
public class javabasic {

	public static void main(String[] args) 
	{
		// for loop
		/* int i;
		 for(i=1;i<=50;i++)
		{
			if(i==10 || i==20 ||i==30 ||i==40)
			{
				i = i+1;
			}
			System.out.println(i);
		}*/
		// While loop
	//	int i=0;
//		while(i<=40)
//		{
//			//System.out.println(i);
//			i++;
//		}
		// Do-While loop
//		do {
//			System.out.println(i);
//			i++;	
//		}while(i<=20);
//				
		// for loop understanding
		/*for(int i=1;i<4;i++)
		{
			System.out.println("outer loop start"+i);
			for(int j=0;j<4;j++)
			{
				System.out.println("inner loop"+j);
			}
			System.out.println("outer loop end"+i);
		}*/
		
		/* 
		 5	2	1 
		 2	0	3
		 */
		//find minimum value
		int a[][]= {{5,2,1},{2,0,3},{3,-1,2}};
		int min = a[0][0];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
	System.out.println(min);

}
}