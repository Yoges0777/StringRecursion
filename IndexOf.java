package StringRecursion;

public class IndexOf 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		String s2="cd";
		myCode(s1,s2);
	}
	//EndOfMainMethod
	private static void myCode(String s1,String s2) 
	{
		int re=loop1(0,s1,s2,0);
		System.out.print(re);
	}
	private static int loop1(int i,String s1,String s2, int cnt)
	{
		if(s2.length()==0)
		return 0;
		if(s2.length()>s1.length())
		return -1;
		if(i<s1.length())
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				int j=i;
				int k=0;
				cnt=loop2(j,k,cnt,s1,s2);
			}
			if(cnt==s2.length())
				return i;
			i++;
			i=loop1(i,s1,s2,cnt);
		}
		return i;
	}
	private static int loop2(int j,int k,int cnt,String s1,String s2)
	{
		if(j<s1.length() && k<s2.length())
		{
			if(s1.charAt(j)==s2.charAt(k))
			{
				cnt++;
			}
			j++;
			k++;
			return loop2(j,k,cnt,s1,s2);
		}
		return cnt;
	}
}
