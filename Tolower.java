package StringRecursion;

public class Tolower {

	public static void main(String[] args) 
	{
		
		
		String s1="ABCD";
		String s2="";

		int i=0;
		s2=iloop(i,s1,s2);
		System.out.println(s2);
	}

	private static String iloop(int i, String s1,String s2) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				char ch=(char)(s1.charAt(i)+32);
				s2=s2+ch;
			}
			else
			{
				s2=s2+s1.charAt(i);
			}

			i++;
			return iloop(i,s1,s2);
		}
		return s2;
	}










	/*	for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				char ch=(char)(s.charAt(i)+32);
				s1=s1+ch;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);*/
}


