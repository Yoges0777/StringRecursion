package StringRecursion;

public class RepeatEchOfThCharacterTwice 
{

	public static void main(String[] args) 
	{
		String s2="";
		String s1="Yogesh";
		
		s2=loop1(0,s1,s2);
		System.out.println(s2);

	}

	private static String loop1(int i, String s1,String s2) 
	{
		if(i<s1.length())
		{
			s2=s2+s1.charAt(i)+s1.charAt(i);
			
			return loop1(++i, s1,s2);
		}
		return s2;
	}
}
