package StringRecursion;


public class MinFrequencyOfCharcer {

	public static void main(String[] args) 
	{
		String s1="aaaabbcccddd";
		int min=Integer.MAX_VALUE;
		char ch=0;
		int []ra=new int [2];
		ra=loop1(0,s1,min,ch,ra);
		System.out.println(ra[0]+" "+(char)ra[1]);
	}
	private static int [] loop1(int i, String s1, int min, char ch,int []ra) 
	{
		if(i<s1.length())
		{
			int cnt=0;
			cnt=loop2(0,i,s1,cnt);
			if(cnt==0)
			{
				int freq=0;
				freq=loop3(0,i,freq,min,ch,s1);
				if(freq<min)
				{
					min=freq;
					ra[0]=min;
					ch=s1.charAt(i);
					ra[1]=ch;
					
				}
			}
			i++;
			return loop1(i,s1,min,ch,ra);
		}
		return ra;
	}
	private static int  loop3(int j,int i,int freq,int min,char ch,String s1)
	{
		if(j<s1.length())	
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				freq++;
			}
			j++;
			return loop3(j,i,freq,min,ch,s1);
		}
		return freq;
	}
	private static int  loop2(int j, int i,String s1,int cnt) 
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
