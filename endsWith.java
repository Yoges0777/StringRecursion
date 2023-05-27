package StringRecursion;

public class endsWith {

	public static void main(String[] args) 
	{
		String s1="yogesh";
		String s2="sh";
		
		int a=s1.length()-1;
		int b=s2.length()-1;
		int cnt=0;
	    cnt=iloop(0,s1,s2,a,b,cnt);
	    if(cnt==s2.length())
	    System.out.println(true);
	    else
	    System.out.println(false);
	}
	private static int iloop(int i, String s1, String s2, int a, int b, int cnt) 
	{
		if(s2.length()<=s1.length())
		{
			if(i<s2.length())
			{
				if(s1.charAt(a)==s1.charAt(b))
				{
					cnt++;
					a--;
					b--;
				}
				return iloop(++i,s1,s2,a,b,cnt);
			}
		}
		return cnt;
	}
}

/*if(s2.length()<=s1.length())
		{
			int i=0;
			int a=s1.length()-1;
			int b=s2.length()-1;
			int cnt=0;

			while(i<s2.length())
			{
				if(s1.charAt(a)==s2.charAt(b))
				{
					cnt++;
				}
				i++;
				a--;
				b--;
			}
			if(cnt==s2.length())
				System.out.println(true);
			else
				System.out.println(false);

		}*/




