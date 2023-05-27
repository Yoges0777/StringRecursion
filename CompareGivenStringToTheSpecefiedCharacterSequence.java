package StringRecursion;

public class CompareGivenStringToTheSpecefiedCharacterSequence {

	public static void main(String[] args)
	{
		String s1="abcd";
		String s2="abcd";
		if(s1.length()<=s2.length())
		{
			int cnt=0;
			cnt= loop1(0,s1,s2,cnt);
			if(cnt==s1.length())
			{
				System.out.println("true");
			}
			else
				System.out.println("false");
		}
		else
		{
			System.out.println("false");
		}
	}
	private static int loop1(int i, String s1, String s2,int cnt)
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)==s2.charAt(i))
			{
				cnt++;
			}	
				i++;
			return loop1(i,s1,s2,cnt);
		}
		return cnt;
	}

}
