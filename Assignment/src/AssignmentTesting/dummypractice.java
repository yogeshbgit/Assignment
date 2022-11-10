package AssignmentTesting;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class dummypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* System.out.println("Write a senetence to find the vovels");
	       Scanner sc = new Scanner(System.in);
	       String scc = sc.nextLine();
	       int i=0;
	       for(char cc : scc.toCharArray())
	       {
	    	   if(cc=='a' ||cc=='e' ||cc=='i' ||cc=='o' ||cc=='u')
	    	   {
	    		   i++;
	    	   }
	       }
	       System.out.println("no of vovels in sentence : "+i);
	       
	       System.out.println("enter for reverse string");
	       String nm = sc.nextLine();
	       StringBuilder sb = new StringBuilder(nm);
	       System.out.println("in reverse : "+sb.reverse());
	       
	       System.out.println("enter string to find out the digits");
	       String sst = sc.nextLine();
	       String dig = sst.replaceAll("\\D", "");
	       System.out.println("no. of digits : "+dig.length());
	       
	       System.out.println("enter string to find out each no of letters");
	       String dum= sc.nextLine();
	      HashMap<Character,Integer> mapcount = new HashMap<Character,Integer>();
	      char[] words = dum.toCharArray();
	      for(char c : words)
	      {
	    	  if(!mapcount.containsKey(c))
	    		  mapcount.put(c, 1);
	    	  else
	    		  mapcount.put(c, mapcount.get(c)+1);
	      }
	      System.out.println("count of each letter : "+mapcount);*/
	      
	      
	      //chech palindrome or not
	  /*    String original = "abba";
	      String rvrse = "";
	      for(int k=original.length()-1;k>=0;k--)
	      {
	    	  rvrse = rvrse + original.charAt(k);
	      }
	      if(original.equals(rvrse))
	    	  System.out.println("it is a palindrom");
	      else
	    	  System.out.println("it is not a palindorm");
	      
	      //reverse string  using  for loop
	      String  name  = "yogesh";
	      for(int l=name.length()-1;l>=0;l--)
	      {
	    	  System.out.println(name.charAt(l));
	      }
	     
	      //no of words
	     /* System.out.println("Enter a string to find no of words");
	      Scanner sc = new Scanner(System.in);
	      String st2 = sc.nextLine();
	      int count=1;
	      for(int m=0;m<=st2.length()-1;m++)
	      {
	    	  if(st2.charAt(m)==' ' && st2.charAt(m+1)!=' ')
	    	  {
	    		  count++;
	    	  }
	      }
			System.out.println("number of words : "+count);*/
			
			//swaping numbers without 3rd variable
		/*	int a=4,b=5;
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("a: "+a+" b: "+b);
			
	        //find out armstrong or not
			int num= 153;
			int a1,sum=0;
			int temp = num;
			while(num>0)
			{
				a1 = num%10;
				num=num/10;
				sum = sum +(a1*a1*a1);
			}
			if(temp==sum)
				System.out.println("this is armstrong");
			else
			System.out.println("this is not armstrong");
			
		    //factorial  numbers 
			factorial(5);
			primenumber(5);
			
			int[] nmrs = {1,2,5,8,10};
			for(int n : nmrs)
			System.out.println(n);
			
			String[] names = {"yogesh","pravin","pruthvi"};
			for(String nm : names)
			System.out.println(nm);
			for(int i=0;i<=names.length-1;i++)
			{
				System.out.println(" *******"+names[i]);
			}
			
			HashSet<String> set = new HashSet<String>();
			HashMap<Integer,String> map = new HashMap<Integer,String>();
			map.put(0, "yogi");
			map.put(1, "yogis");
			map.put(2, "yogishwar");
			
	// print duplicate string
			System.out.println(map);
				ArrayList<String> list = new ArrayList<>();
				list.add("sachin");
				list.add("virat");
				list.add("dhoni");
				list.add("dhoni");
				list.add("rohit");
				HashSet<String> set1 = new HashSet<String>();
				for(String str : list)
				{
					if(set1.add(str)==false)
						System.out.println("///****"+str);
				}*/
			//	printuniquenumber();
		highestnumber();
		datecalender();
	}
	
	public static void factorial(int n1)
	{
		int fact = 1;
		for(int i=1;i<=n1;i++)
		{
			fact = fact*i;
		}
		System.out.println("factorial : "+fact); 
	}
	public static void primenumber(int n2)
	{
		int temp=0;
		for(int i=1;i<=n2;i++)
		{
			if(n2%i==0)
				temp++;
		}
		if(temp==2)
			System.out.println(n2+" it is prime number");
		
		else
		{
			System.out.println(n2+" it is not prime number");
		}
		
		
	}
	
	public static void printuniquenumber()
	{
		int[] a = {1,1,2,2,4,4,5,7,7,8,8,9,6,6};
		ArrayList<Integer> ab=  new ArrayList<>();
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
						k++;
				}
			}
			if(k==1)
			System.out.println("Unique number is : "+a[i]);
		}
	}
	
	public static void highestnumber()
	{
		int a[]= {2,50,4,9,11,25};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The Highest Number is: "+max);
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The Lowest Number is : "+min);
		
	}
	
	public static void datecalender()
	{
		Date d = new Date();
		//System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		
		Calendar cal=Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
	}
	
}
