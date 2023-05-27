package StringRecursion;

public class PrintUnique {

	public static void main(String[] args) 
	{
		String s1="aaabbbcccdd";
		String s2="";
		
		s2=loop(s1,s2,0);
		System.out.println(s2);
		}
	private static String loop(String s1, String s2, int i) 
	{
		if(i<s1.length())
		{
			if(isUniqueMethod(s1,i,0))
				s2=s2+s1.charAt(i);
			return loop(s1,s2,++i);
		}
		return s2;
	}
	private static boolean isUniqueMethod(String s1, int i, int j) 
	{
		if(j<i)
		{
			if(s1.charAt(i)==s1.charAt(j))
				return false;
			return isUniqueMethod(s1,i,++j);
		}
		return true;
	}
}