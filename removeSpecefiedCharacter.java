package StringRecursion;

public class removeSpecefiedCharacter {

	public static void main(String[] args) 
	{
		String s1="abcde";
		String s2="";
		char ch='b';
		
		int i=0;
		s2=iloop(i,s1,s2,ch);
		System.out.println(s2);
		
	}

	private static String iloop(int i, String s1, String s2, char ch) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)!=ch)
			{
				s2=s2+s1.charAt(i);
			}
			i++;
			return iloop(i,s1,s2,ch);
		}
		return s2;
	}
}

     /* int cnt=0;
	 for(int i=0;i<s1.length();i++)
	 {
		 if(s1.charAt(i)!=ch)
		 {
			s2=s2+s1.charAt(i);
		 }
	 }
	 System.out.println(s2);
	}*/
