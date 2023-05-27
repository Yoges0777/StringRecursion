package StringRecursion;

public class EqualsMethod {

	public static void main(String[] args) 
	{
		
		String s1="Hefshine";
		String s2="hefshine";
		
		boolean result=equals(s1,s2);
		System.out.println(result);
	}

	private static boolean equals(String s1, String s2) 
	{
		if(s1.length()!=s2.length())
		return false;
		return loop(s1,s2,0);
	}

	private static boolean loop(String s1, String s2, int i) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			return false;
			return loop(s1,s2,++i);
		}
		
		return true;
	}

}
