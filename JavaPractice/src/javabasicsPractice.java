import java.util.Arrays;
import java.util.Scanner;

public class javabasicsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To find upper,lower,digits letter in given string*****************
		 String str = "My name is Shri & my email id is shrini123@gmail.com";

	        int upperCase = 0;
	        int lowerCase = 0;
	        int digits = 0;
	        int other = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (Character.isUpperCase(ch)) {
	                upperCase++;
	            } else if (Character.isLowerCase(ch)) {
	                lowerCase++;
	            } else if (Character.isDigit(ch)) {
	                digits++;
	            } else {
	                other++;
	            }
	        }

	        System.out.println("Upper case letters: " + upperCase);
	        System.out.println("Lower case letters: " + lowerCase);
	        System.out.println("Digits : " + digits);
	        System.out.println("Other letters: " + other);
	        
	        
	        String strng = "This is my email id - yogeshbingi0123@gmail.com and My name is YOGESH";
	        
	        int upper = 0;
	        int lower = 0;
	        int digit = 0;
	        int othr = 0;
	        for(int i=0;i<strng.length();i++)
	        {
	        	char chr = strng.charAt(i);
	        	if(Character.isUpperCase(chr))
	        		upper++;
	        	if(Character.isLowerCase(chr))
	        		lower++;
	        	if(Character.isDigit(chr))
	        		digit++;
	        		else
	        		othr++;
	        	
	        }
	        System.out.println("Upper case Letters: "+upper);
	        System.out.println("lower case Letters: "+lower);
	        System.out.println("digits : "+digit);
	        System.out.println("Other: "+othr);
	        
	        //get no of letters count for specific letter "a"
	        String str1 = "Java is java again java again".toLowerCase();
	        int len = str1.length() - str1.replace("a", "").length();
	        System.out.println(len);
	        
	        // count no of vovels in string**************
	        String input = "How many vowels in this String";
	        System.out.println("total lenght : "+input.length());
	        int count=0;
	        int otherr=0;
	        for(char ch : input.toCharArray())
	        {
	        	//if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
	        //		count++;
	        }
//	        System.out.println(count);
	        
	        for(int i=0;i<input.length();i++)
	        {
	        	char c = input.charAt(i);
	        	if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
	        		count++;
	        	else
	        		otherr++;
	        }
	        System.out.println("vovels : "+count);
	        System.out.println("other : "+otherr);
	       
	       if(input.length()==count+otherr)
	       {
	    	   System.out.println("true");
	       }
	     
	       // Palindrome  or not
	       String original="aba";
	       String reverse = ""; // Objects of String class  
	       int length = original.length();   
	        
	  for ( int i = length - 1; i >= 0; i-- ) {  
	           reverse = reverse + original.charAt(i);
	        }
	        
	  if (original.equals(reverse))  
	           System.out.println("String is a palindrome.");  
	        else  
	           System.out.println("String isn't a palindrome.");  
	  
	  		// Reverse number
				int num = 1006;
				int rev = 0;
				int temp = num;
				
				while(num>0)
				{
					rev = rev*10;
					rev = rev + num % 10;
					num = num/10;
					
				}
				System.out.println("reverse number : "+rev);
	  
	  //Armstrong Number 
			int n = 153;
			int a ,sum = 0;
			int tem = n;
			while(n>0)
			{
				a = n%10;
				n=n/10;
				sum = sum + (a*a*a);
			}
			if(tem==sum)
			{
				System.out.println("this  is armstrong");
			}
			else
				System.out.println("this  is not armstrong");
	  }

	

}