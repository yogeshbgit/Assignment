import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import AssignmentTesting.*;


public class practiseRevise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		reversename();
//		countofword();
//		jointwords();
//		removedigits();
//		intstringconvert();
//		countofeachletter();
//		anagram();
//		countoflowerupperdigits();
//		countofvovels();
//		palindrome();
//		factorial();
//		primenumberbetweenNnumber();
//		duplicatestring();
//		finduniqeNumber();
//		highestNlowestnumbe();
//		DateNcalender();
		
		 int arr[] = {10,20,20,30,30,40,50,50};
		int lenght = arr.length;
		lenght = removeduplicate(arr, lenght);
		for(int i=0;i<lenght;i++)
		{
		//	System.out.print(arr[i]+" ");
		}
		
	//	findduplchar();
		//sumofall();
	//	findOddEvenNumber();
		
		//Import Project and Package From another Project called Assignment with package name AssignmentTeting
		oopsConcepts op = new oopsConcepts("Yogesh","Solapur","Sambhaji",105);
	//op.display();
		
		// calling another class from same project and package
		dummypractice dp = new dummypractice();
		dp.factorial(5);

		
	}
	
	public static void reversename()
	{
		//Reverse word*****************
	
		String nm = "sachin";
		for(int i=nm.length()-1;i>=0;i--)
		{
			System.out.print(nm.charAt(i));
	
		}
		
		System.out.println("");
		
		//Reverse sentence*****************
		
		String sent = "check for reverse name";
		String[] se = sent.split(" ");
		for(int i=se.length-1;i>=0;i--)
		{
			System.out.println(se[i]);
		}
		
		//Reverse number*****************
		
		int num=1456;
		int rvr = 0;
		while(num>0)
		{
			rvr = rvr*10;
			rvr= rvr+num%10;
			num = num/10;
		}
		System.out.println(rvr);
	}
	
	public static void countofword()
	{
		String nm = "this is to check count of words";
		int count=1;
		for(int i=0;i<=nm.length()-1;i++)
		{
			if(nm.charAt(i)==' ' && nm.charAt(i+1)!=' ')
				count++;
		}
		System.out.println("count of words : "+count);
	}
	
	public static void jointwords()
	{
		StringBuffer st = new StringBuffer("hello");
		st.append(" yogesh");
		System.out.println(st);
	}
	
	public static void removedigits()
	{
		String st = "My email id is yogesh12binig34@gmail.com";
		String digits = st.replaceAll("\\D", "");
		System.out.println("digits : "+digits);
		String sentwithoutdigits = st.replaceAll("\\d", "");
		System.out.println("sentence without digits : "+sentwithoutdigits);
	}
	
	public static void intstringconvert()
	{
		int number = 50;
		String nm = Integer.toString(number);
		System.out.println("int to string : "+nm);
		
		String st = "60";
		int nb = Integer.parseInt(st);
		System.out.println("string to int : "+nb);
				
	}
	
	public static void countofeachletter()
	{
		String st = "this is for count of each letter";
		char[] ch = st.toCharArray();
		HashMap<Character,Integer> map =new  HashMap<Character,Integer>();
		for(char cb : ch)
		{
				if(!map.containsKey(cb))
					{map.put(cb, 1);}
				else
					map.put(cb, map.get(cb)+1);
			
		}
		System.out.println("count of each  letter : "+map);
	}
	
	public static void anagram()
	{
		String st1 = "yogis";
		String st2 = "sgoyi";
		boolean flag = true;
		if(st1.length()!=st2.length())
			flag=false;
		else
		{
			char[] c1 = st1.toLowerCase().toCharArray();
			char[] c2 = st2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag=Arrays.equals(c1, c2);
		}
		if(flag==true)
			System.out.println("It is anagram");
		else
			System.out.println("It is not anagram");
	}
	
	public static  void countoflowerupperdigits() 
	{
		String st = "String to test Upper and Lower case and DIGITS";
		int upper=0,lower=0,digit=0,other=0;
		for(char ch  : st.toCharArray())
		{
			if(Character.isUpperCase(ch)) 
				{upper++;}
			if(Character.isLowerCase(ch))
				{lower++;}
			if(Character.isDigit(ch))
				{digit++;}
			else
				{other++;}
		}
		
		System.out.println("Upper char : "+upper);
		System.out.println("lower char : "+lower);
		System.out.println("digit  : "+digit);
		System.out.println("other char : "+other);
 	}
	
	public static void countofvovels()

	
	{
		String st ="string to check count of vovels";
		HashSet<Character> vovels = new HashSet<Character>();
		int count=0;
		for(char c : st.toCharArray())
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				vovels.add(c);
				count++;
			}
		}
		System.out.println("No of vovels : "+count);
		System.out.println("vovels are : "+vovels);
	}
	
	public static void palindrome()
	{
		String original = "yay";
		String reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println("It is palindorme");
		else
			System.out.println("It is not palindrome");
		
	}

	public static  void factorial()
	{
		int n = 3;
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial of "+n+" is : "+fact);
	}
	
	public static  void primenumberbetweenNnumber()
	{
		System.out.println("Enter Max Number : ");
		Scanner sc = new Scanner(System.in);
		int maxnumber = sc.nextInt();
		System.out.println("prime numbers are  : ");
		for(int i=2;i<=maxnumber;i++)
		{
			boolean isprime=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				} 
			}
				if(isprime==true)
					System.out.println(i);
		}
	}
	
	public  static void duplicatestring()
	{
		String[] names = {"sachin","dhoni","virat","dhoni","rahul","sachin"};
		HashSet<String> set = new HashSet<>();
		for(String st : names)
		{
			if(set.add(st)== false)
			{
				System.out.println("Duplicates are : "+st);
			}
		}
		
	}

	public static void  finduniqeNumber()
	{
		int a[] = {1,1,2,2,4,5,5,6,7,7,8,8,9,10};
		ArrayList<Integer> ab = new ArrayList<>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!ab.contains(a[i])) 
			{
				ab.add(a[i]);
				k++;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
			}
			if(k==1)
			System.out.println("unique number is : "+a[i]);
			
		}
	}
	
	public static void highestNlowestnumbe()
	{
		int a[]= {5,8,1,4,6,9,10,52,64,80,12,40};
		int max=a[0];
		int min = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("highest number is : "+max);
		System.out.println("Lowest Number is : "+min);
	}
 	
	public static void DateNcalender()
	{
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.MONTH));
				
	}
	
	public static int removeduplicate(int arr[],int n)
	{
		if(n==0||n==1)
			return n;
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=arr[i+1])
				{
				temp[j++]=arr[i];
				}
		}
		temp[j++]= arr[n-1];
		for(int i=0;i<j;i++)
		{
			arr[i]=temp[i];
		}
		
		return j;
		
		
	}
	
	public static void findduplchar() 
	{
		String nm = "yoggeshhh check this outtt";
		HashSet<Character> set = new HashSet<Character>();
		for(char c: nm.toCharArray())
		{
			if(set.add(c)==false)
				System.out.print(c+" ");
		}
	}

	public static void sumofall()
	{
		//type  1
		int[] ab = {1,2,6};
		int sum = 0;
		for(int i=0;i<ab.length;i++)
		{
			sum = sum + ab[i];
		}
		System.out.println("sum of number = "+sum);
	
		//type  2
		List<Integer> list = Arrays.asList(5,5,5,6,4);
		Optional<Integer> sum1 = list.stream().reduce((a,b) -> a+b);
		System.out.println("sum of all numbers = "+sum1.get());
	
		//find avarage
		double avg =list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("average = "+avg);
		
		//square of list array and filter above 10 value only and get average
		double fl = list.stream().map(e->e*e).filter(e->e>=10).mapToInt(e -> e).average().getAsDouble();
		System.out.println("**average = "+fl);
		
		
		
	}
	public static void findOddEvenNumber()
	{
		int[] a= {1,2,4,55,5,6,7,9,12,65,84,34,66};
		int odd=0;
		int even=0;
		List<Integer> ev= new ArrayList<>();
		List<Integer> od = new ArrayList<>();
	for(int i=0;i<a.length;i++)
	{
		if(a[i]%2==0)
		{	even++;
			ev.add(a[i]);
			//System.out.print("Even = "+a[i]+", "); 
			}
		else
		{	odd++;
			od.add(a[i]);
			//System.out.print("odd = "+a[i]+", ");
			}
	}
	Collections.sort(ev);
	Collections.sort(od);
	System.out.print("Even : "+ev+" | total : "+even);
	System.out.println("");
	System.out.print("odd : "+od+"  | total : "+odd);

	}
}
 