package StringRecursion;

public class ConcanateGiveStringToanotheString {

	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="efg";
		
		iloop(s1,s2);
	}

	private static void iloop( String s1, String s2) 
	{
	  	s1=s1.concat(s2);
	  	System.out.println(s1);
	}

}
