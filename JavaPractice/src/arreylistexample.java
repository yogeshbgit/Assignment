import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

import org.openqa.selenium.WebElement;

public class arreylistexample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		/*ArrayList<String> names = new ArrayList<String>();
		names.add("yogesh");
		names.add("Pravin");
		names.add("naren");
		names.add("pruthvi");
		System.out.println(names);
		names.add(1, "kumar");
		System.out.println(names);
		names.remove(3);
		System.out.println(names);
		System.out.println(names.get(2));
		System.out.println(names.indexOf("pruthvi"));
		System.out.println(names.contains("yogesh"));
		System.out.println(names.isEmpty());
		names.remove("pruthvi");
		System.out.println(names);*/
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("yogesh");
		hs.add("yogesh");
		hs.add("parvin");
		hs.add("naren");
		//System.out.println(hs);
		
		HashMap<Integer,String> mp = new HashMap<Integer,String>();
		mp.put(0, "map0");
		mp.put(3, "map1");
		mp.put(2, "map2");
		mp.put(1, "map3");
		mp.replace(2, "yogesh");
		mp.remove(1);
//		System.out.println(mp.containsKey(5));
//		System.out.println(mp.containsValue("yogesh"));
//		System.out.println(mp);

		String names[]= {"yogesh","pravin"};
		
		//System.out.println(names[1]);
		//print unique number interview question from amazon
		/*int a[]= {1,3,4,6,5,2,8,7,9,10,16,13,11,17,18,22,30};
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				al.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					k++;
				}
				//System.out.println(a[i]+" - "+k);
				//if(k==1)
			//System.out.println(a[i]+" is unique number");
			}
		}
		int even=0;
		int odd =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				even++;
				System.out.println("Even Numbers : "+a[i]);
			}
			else
			{
				odd++;
				System.out.println("Odd Numbers : "+a[i]);
			}
		}
		System.out.println("Number of even number : "+even);
		System.out.println("Number  of odd number : "+odd);*/

		String nm = "Yogesh Bhaskar Bingi";
		
		int count =0;
//		for(int i=0;i<nm.length();i++)
//		{
//			char ch = nm.charAt(i);
//			System.out.println(ch);
//			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
//				count++;
//				
//			}
//		}
//		System.out.println("Numbers of vovels in Yogesh : "+count);
		/*System.out.println("Enter a Sentense to get no of vovels : ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		for(int i=0;i<sentence.length();i++)
		{
			char ch = sentence.charAt(i);
			//System.out.println(ch);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') {
				count++;
				
			}
		}
		System.out.println("Numbers of vovels  : "+count);*/
		
		/*System.out.println("Enter any number to identify even or odd:  ");
		int n1;
		Scanner readme = new Scanner(System.in);
		n1 = readme.nextInt();
		if(n1%2==0)
		System.out.println("You have entered even number : "+n1);
		else
			System.out.println("You have enterd odd number : "+n1);*/
		
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int k = 1;
		int count1 = sc.nextInt();
		for(int i=1;i<count1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k+"\t");
				k++;
			}
			
			System.out.println("");
		}
		
		
			
	}}
