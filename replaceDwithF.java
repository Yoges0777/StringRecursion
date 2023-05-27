package StringRecursion;

public class replaceDwithF {

	public static void main(String[] args) 
	{
		String s1="abcdeee";
		char ch1='e';
		char ch2='f';
		String s2="";
		s2=iLoop(0,s1,s2,ch1,ch2);
		System.out.println(s2);
	}
	private static String iLoop(int i,String s1,String s2,char ch1,char ch2)
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)==ch1)
			s2+=ch2;
			else
			s2+=s1.charAt(i);
			return iLoop(++i,s1,s2,ch1,ch2);
		}
		return s2;
	}

	
	
	
	/*	for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch1)
				s2=s2+ch2;
			else
				s2=s2+s1.charAt(i);
		}
		System.out.println(s2);*/

	}


