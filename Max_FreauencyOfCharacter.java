package StringRecursion;

public class Max_FreauencyOfCharacter {

	public static void main(String[] args) 
	{
		String s1="abbcccdddd";
		int max=Integer.MIN_VALUE;
		char ch=0;
		int []ra=new int[2];
		loop1(0,max,ch,s1,ra);
		System.out.print(ra[0]+" "+(char)ra[1]);
	}
	private static int[] loop1(int i,int max,char ch,String s1,int[]ra)
	{
		if(i<s1.length())
		{
			int cnt=0;
			cnt=loop2(0,i,s1,cnt);
			if(cnt==0)
			{
				int freq=0;
				freq=loop3(0,i,freq,s1,max,ch);
				if(freq>max)
				{
					max=freq;
					ra[0]=max;
					ch=s1.charAt(i);
					ra[1]=ch;
				}
			}
			i++;
			loop1(i,max,ch,s1,ra);
		}
		return ra;
	}
	private static int  loop3(int j,int i,int freq,String s1,int max,char ch)
	{
		if(j<s1.length())
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				freq++;
			}
			j++;
			return loop3(j,i,freq,s1,max,ch);
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
		
		
		/*for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
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
				}
				if(freq>max)
				{
					max=freq;
					ch=s1.charAt(i);
				}
			}
		}
		System.out.println(ch+" "+max);*/
	}
