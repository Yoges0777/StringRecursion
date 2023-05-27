package StringRecursion;

public class SecondMax {

	public static void main(String[] args) 
	{
		String s1="abbcccdddd";
		int fmax=Integer.MIN_VALUE;
		int smax=0;
		char ch=0;
int []ra=new int [2];
System.out.println(ra[0]);
System.out.println((int)ra[1]);
		ra=loop1(0,fmax,smax,ch,s1,ra);
	}
	private static int[] loop1(int i,int fmax,int smax,char ch,String s1,int []ra)
	{
		if(i<s1.length())
		{
			int cnt=0;
			cnt=loop2(0,i,fmax,smax,ch,cnt,s1);
			if(cnt==0)
			{
				int freq=0;
			    freq=loop3(0,i,s1,fmax,smax,freq);
			    if(freq>fmax)
			    {
			    	smax=fmax;
			    	fmax=freq;
			    }
			    if(freq>smax && freq<fmax)
			    {
			    	smax=freq;
			    	ch=s1.charAt(i);
			    }
			}

			i++;
			return loop1(i,fmax,smax,ch,s1,ra);
		}
		ra[0]=smax;
				ra[1]=ch;
		return ra;
			
	}
	private static int loop3(int j,int i,String s1,int fmax,int smax,int freq)
	{
		if(j<s1.length())
		{   
			if(s1.charAt(i)==s1.charAt(j))
				freq++;
			
			j++;
			return loop3(j,i,s1,fmax,smax,freq);
		}
		return freq;
		
		
	}
	private static int loop2(int j,int i,int fmax,int smax,char ch,int cnt,String s1)
	{
		if(j<i)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				cnt++;
			}
			j++;
			return loop2(j,i,fmax,smax,ch,cnt,s1);
		}
		return cnt;
	}
}
/*for(int i=0;i<s1.length();i++)
		{int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
					cnt++;
			}
			if(cnt==0)
			{
				int freq=0;
				for(int j=0;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						freq++;
					}
					if(freq>fmax)
					{
						smax=fmax;
						fmax=freq;
					}
					if(freq>smax && freq<fmax)
					{
						smax=freq;
						ch=s1.charAt(i);
					}
				}
			}
		}
		System.out.println(smax+" "+ch);*/
