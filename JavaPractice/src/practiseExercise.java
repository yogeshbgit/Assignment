import java.util.Arrays;
import java.util.HashMap;

public class practiseExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Print Reverse Name ***/
		String nm = "yogesh";
		for(int i=nm.length()-1;i>=0;i--)
		{
			System.out.println(nm.charAt(i));
		}
		String nm1 = "prabhas";
		StringBuilder  str = new StringBuilder(nm);
		System.out.println("using stringbuilder : "+str.reverse());
		
		StringBuilder sb = new StringBuilder(nm1);
		System.out.println("prabhas reverse name : "+sb.reverse());
		
		StringBuffer sb1 = new  StringBuffer(nm1);
		System.out.println("prabhas in reverse with string buffer : "+sb1.reverse());
		
		StringBuffer sf = new StringBuffer(nm);
		sf.deleteCharAt(1);
		System.out.println("charecter at 2nd index : "+sf.charAt(2));
		System.out.println("using stringbuffer : "+sf.reverse());
		
		char[] ch = nm.toCharArray();
		for(int i=(ch.length)-1;i>=0;i--)
		{
			System.out.println("using characterArrey : "+ch[i]);
		}
		
		char[] ch11 = nm1.toCharArray();
		for(int i=ch11.length-1;i>=0;i--)
		{
			System.out.println("using tochararrey : "+ch11[i]);
		}
		
		// reverse sentence*************
        
		String sent = "My name is Yogesh Bingi";
		String[] sent1 = sent.split(" "); 
		for(int i=sent1.length-1;i>=0;i--)
		{
			System.out.println("Reverse Sentence : "+sent1[i]);
		}
		
		String strr = "I am a boy";
		int count=1;
		for(int i=0;i<strr.length()-1;i++)
		{
			if(strr.charAt(i) == ' ' && strr.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("No of words in String : "+count);
		
				
		String st2 = "My name is yogesh bingi, i am from solapur";
		int k = 1;
		for(int i=0;i<st2.length()-1;i++)
		{
			if(st2.charAt(i)==' ' && st2.charAt(i+1)!=' ' )
			{
				k++;
			}
		}
		System.out.println("no of words in second  string :  "+k);
		
		String st3 = "I came to learn java code in selenium";
		int j=1;
		for(int i=0;i<st3.length()-1;i++)
		{
			if(st3.charAt(i)==' ' && st3.charAt(i+1)!=' ')
			{
				j++;
				
			}
		}
		System.out.println("count : "+j );
		
		String st4 = "Hello";
		st4.concat("Yogesh");
		System.out.println(st4);
		
		// joint of two words
        StringBuffer st5 = new StringBuffer("Hello");
        st5.append(" yogesh");
        System.out.println(st5);
       
        // replacing word 
        String input = "Hello World";
        String[] words = input.split(" ");
        String newWord = words[1].replace("o", "t");
        System.out.println(words[0] +" "+newWord);

         //to remove all  non digits from  string
        String s1 = "helloThisIsA1234Sample";
        s1 = s1.replaceAll("\\D","");
        System.out.println("Only Number : "+s1);
        
        // to remove all digits from string
        String s2 = "helloThisIsA1234Sample";
        s2 = s2.replaceAll("\\d","");
        System.out.println("Only String : "+s2);
        
         //Convert int to string
        int l = 100;
        String li = Integer.toString(l);
         
        // Convert string to int
       String nn = "90";
        int nni = Integer.parseInt(nn);
        
        // string anagrams
        String stt1 = "Yogesh".replaceAll("\\s", "");
        String stt2 = "Ganesh".replaceAll("\\s", "");
        boolean flag =true;
        if(stt1.length()!=stt2.length())
        {
        	flag = false;
        }
        else
        {
        	char[] chh1 = stt1.toLowerCase().toCharArray();
        	char[] chh2 = stt2.toLowerCase().toCharArray();
        
        	Arrays.sort(chh1);
        	Arrays.sort(chh2);
        	flag = Arrays.equals(chh1, chh2);
        }
        if(flag==true)
        {
        	System.out.println("string are anagram");
        }
        else
        {
        	System.out.println("string are not anagram");
        }
        
        String str1 = "Ganesh".replaceAll("\\s", "");
        String str2 = "Nagesh".replaceAll("\\s", "");
        boolean flag1 = true;
        
        if (str1.length() != str2.length()) {
            flag1 = false;
        } else {
            char[] ch01 = str1.toLowerCase().toCharArray();
            char[] ch02 = str2.toLowerCase().toCharArray();

            Arrays.sort(ch01);
            Arrays.sort(ch02);
            flag = Arrays.equals(ch01, ch02);
        }
        if (flag == true) {
            System.out.println("Strings are Anagram");
        } else {
            System.out.println("Strings are not Anagram");
        }
        
        String n1 = "Yogi".replaceAll("\\s", "");
        String n2 = "goyi".replaceAll("\\s", "");
        boolean flag2 = true;
        if(n1.length()!=n2.length())
        	flag2 =false;
        else
        {
        	char[] nn1 = n1.toLowerCase().toCharArray();
        	char[] nn2 = n2.toLowerCase().toCharArray();
        	
        	Arrays.sort(nn1);
        	Arrays.sort(nn2);
        	flag=Arrays.equals(nn1, nn2);
        }
        if(flag==true)
        {
        	System.out.println("Anagram");
        }
        else
        	System.out.println("Non anagram");
	
        
        String str01 = "My name is Shriniwas";
        String[] words1 = str01.split(" ");
        String reverseString = "";

        for (int i = 0; i < words1.length; i++) {

            String word = words1[i];
            String reverseWord = "";
            for (int ii = (word.length() - 1); ii >= 0; ii--) {
                reverseWord = reverseWord + word.charAt(ii);
            }

            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println("Input : " + str01);
        System.out.println("Output : " + reverseString);
        
        
        String mynm = "My name is Yogesh Bingi";
    	String[] inword = mynm.split(" ");
    	String reversest = "";
    	for(int a=0;a<inword.length;a++)
    	{
    		String eachword= inword[a];
    		String reverseword = "";
    		for(int b=eachword.length()-1;b>=0;b--)
    		{
    			reverseword = reverseword + eachword.charAt(b);
    		}
    		reversest = reversest + reverseword + " ";
    	}
    	System.out.println("before : "+mynm);
    	System.out.println("after : "+reversest);
	
    	//replace space using replaceall
    	String str00 = "My name is Shriniwas Alle";
        String strWithoutSpace = str00.replaceAll("\\s", "");
        System.out.println("Using replaceAll method : "+strWithoutSpace);
        
        
        
        // counting  each  character 
        String stt = "Yogesh is my name".toLowerCase();
        HashMap<Character,Integer> charcountmap = new HashMap<Character,Integer>();
        char[] charr = stt.toCharArray();
        for(char c : charr)
        {
        	if(charcountmap.containsKey(c))
        	{
        		charcountmap.put(c, charcountmap.get(c)+1);
        	}
        	else
        	{
        		charcountmap.put(c, 1);
        	}
        }
        System.out.println("char count map: "+charcountmap);
        
        // counting  each  character 
        String stn = "this is for testing purose only please check this out".toLowerCase();
        HashMap<Character,Integer> countmap = new HashMap<Character,Integer>();
        char[] ch000 = stn.toCharArray();
        for(char cb : ch000)
        {
        	if(!countmap.containsKey(cb))
        	{
        		countmap.put(cb, 1);
        	}
        	else
        	{
        		countmap.put(cb, countmap.get(cb)+1);
        	}
        	
        }
        System.out.println("count for each word: "+countmap);
        
        
        
        
	}
}
