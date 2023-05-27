package StringRecursion;

public class StartsWith {

	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="abcdo";
		int cnt=0;
		cnt=iloop(0,s1,s2,cnt);
		if(cnt==s2.length())
			System.out.println(true);
		else
			System.out.println(false);
	}

	private static int iloop(int i, String s1, String s2, int cnt) 
	{
		if(s2.length()<=s1.length())
		{
			if(i<s2.length())
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					cnt++;
				}
				i++;
				return iloop(i,s1,s2,cnt);
			}
			
		}
		return cnt;
	}
}

/*if(s2.length()<=s1.length())
		{
			int cnt=0;
			for(int i=0;i<s2.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(i))
				{
					cnt++;
				}
			}
			if(cnt==s2.length())
			{
				System.out.println(true);
			}
			else
			{
				System.out.println(false);
			}
		}
		else 
		System.out.println(false);
 */
