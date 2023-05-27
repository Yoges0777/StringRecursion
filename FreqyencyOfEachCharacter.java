package StringRecursion;

public class FreqyencyOfEachCharacter {

	public static void main(String[] args) 
	{
		String s1="aabbcccdddd";
		loop1(0,s1);
	}
	private static void loop1(int i,String s1)
	{
		if(i<s1.length())
		{
			int cnt=0;
			cnt=loop2(0,i,s1,cnt);
			if(cnt==0)
			{
				int freq=0;
				freq=loop3(0,i,s1,freq);
				System.out.println(s1.charAt(i)+" "+freq);
			}
			i++;
			loop1(i,s1);
		}
	}
	private static int  loop3(int j,int i,String s1,int freq)
	{
		if(j<s1.length())
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				freq++;
			}
				j++;
				return loop3(j,i,s1,freq);		
		}
		return freq;
	}
		private static int loop2(int j,int i,String s1,int cnt)
		{
			if(j<i)
			{
				if(s1.charAt(i)==s1.charAt(j))
					cnt++;

				j++;
				return loop2(j,i,s1,cnt);
			}
			return cnt;
		}

	}
