package StringRecursion;

public class trim {

	public static void main(String[] args) 
	{
		String s1="  abc  ab  ";
		String s2="";
		
		int i=0;
		s2=iloop(i,s1,s2);
		System.out.println(s2);
	}

	private static String iloop(int i, String s1,String s2) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)!=' ')
			{
				s2=s2+s1.charAt(i);
			}
			i++;
			return iloop(i,s1,s2);
		}
		return s2;
	}
		
		/*for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);*/

	}


