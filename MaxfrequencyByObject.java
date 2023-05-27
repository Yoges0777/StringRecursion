package StringRecursion;

public class MaxfrequencyByObject {

	public static void main(String[] args) 
	{
		String s1="abdfffsds";
		int i=0;
		int fmax=Integer.MIN_VALUE;
		char ch=0;
		int []temp=new int[2];
		temp=iloop(i,s1,fmax,ch,temp);	
		System.out.println((char)temp[1]+" "+temp[0]);
		}
	private static int [] iloop(int i,String s1, int fmax, char ch, int[] temp)
	{
		if(i<s1.length())
		{int j=0;
			int cnt=0;
			cnt=jloop(i,j,cnt,s1,fmax);
			if(cnt==0)
			{
				int f=0;
				f=freq(0,i,s1,f,fmax);
			
				if(f>fmax)
				{
					fmax=f;
					ch=s1.charAt(i);
				}
			}		
			 i++;
		return iloop(i,s1, fmax, ch, temp);
		}
		temp[0]=fmax;
		temp[1]=ch;
		return temp;
	}
	private static int freq(int k, int i, String s1, int f, int fmax) 
	{
		if(k<s1.length())
		{
			if(s1.charAt(i)==s1.charAt(k))
				f++;
			k++;
			return freq(k, i, s1, f, fmax);
		}
		return f;	
	}
	private static int jloop(int i, int j, int cnt,String s1, int fmax) 
	{
		if(j<i)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				cnt++;
			}
			j++;
			return jloop(i,j,cnt,s1, fmax);
		}
		return cnt;
	}
	}
		

	


