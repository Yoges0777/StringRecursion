package StringRecursion;

public class ContainsOnlydigit {

	public static void main(String[] args) 
	{
		String s1="yog12e1sh";

		int cnt=0;
		cnt=iloop(0,s1,cnt);
		if(cnt==s1.length())
		System.out.println("contains only digit");
		else
		System.out.println("not only digit");
	}
	private static int iloop(int i, String s1,int cnt) 
	{
		if(i<s1.length())
		{
            if(s1.charAt(i)>'0' && s1.charAt(i)<='9')
            {
            	cnt++;
            }
            return iloop(++i,s1,cnt);
		}
		return cnt;
	}

































		






































		/*	String s1="yog12e1sh";

			int cnt=0;
			for(int i=0;i<s1.charAt(i);i++)
			{
				if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
				{
					cnt++;
				}
			}
			if(cnt==s1.length())
				System.out.println("contains only digit");
			else
				System.out.println("not only digit");
		}*/

	}
