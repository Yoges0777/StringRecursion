package StringRecursion;


public class StringContainsOnlyDigit {

	public static void main(String[] args) 
	{
		String s1="yoog1es8g";
		int cnt=0;
		cnt=loop1(0,s1,cnt);
		System.out.println(cnt);
		if(cnt==s1.length())
			System.out.println("String Contains Only digirt");
		else 
		    System.out.println("not only digit");
	}

	private static int loop1(int i, String s1,int cnt) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				cnt++;
			}
			
			i++;
			return loop1(i, s1, cnt);
		}
		return cnt;
	}

}
