package StringRecursion;

public class MagicalString {

	public static void main(String[] args) 
	{
		String s1="varun";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=(char)(219-s1.charAt(i));
			s2=s2+ch;
		}
		System.out.println(s2);

	}

}
