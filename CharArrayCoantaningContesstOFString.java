package StringRecursion;

public class CharArrayCoantaningContesstOFString {

	public static void main(String[] args) 
	{
		String s="hefshine";
		char[]ca=new char[s.length()];
	
		ca=rec(ca,s,0);
		for(char ch:ca)
		System.out.print(ch+" ");
	}

	private static char[] rec(char[] ca, String s, int i) 
	{
		if(i<ca.length)
		{
			ca[i]=s.charAt(i);
			rec(ca,s,++i);
		}
		return ca;
	}
}
