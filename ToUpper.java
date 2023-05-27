package StringRecursion;

public class ToUpper {

	public static void main(String[] args) 
	{
		String s="Hefshine";
		s=toUpper(s,"",0);
		System.out.println(s);
	}

	private static String toUpper(String s, String s2, int i) 
	{
		if(i<s.length())
		{
			char  ch=s.charAt(i);
			if(ch>='a' && ch<='z')
				ch=(char)(ch-32);
			
			s2=s2+ch;
			return toUpper(s,s2,++i);
		}
		return s2;
	}

}
