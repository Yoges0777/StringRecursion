package StringRecursion;

public class PrintDuplicatefronInputString {

	public static void main(String[] args) 
	{
		String s1="aabbccdd";
		String s2="";
		
		int i=0;
		s2=iloop(i,s1,s2);
		System.out.print(s2);
		
	}

	private static String iloop(int i, String s1, String s2) 
	{
		if(i<s1.length())
		{
			int j=0;
			int cnt=0;
			cnt=jloop(j,i,cnt,s1);
			if(cnt>0)
			{
				s2=s2+s1.charAt(i);
			}
			
			i++;
			return iloop(i,s1,s2);
		}
		return s2;
		
	}

	private static int jloop(int j, int i, int cnt,String s1) 
	{
		if(j<i)
		{
			if(s1.charAt(i)==s1.charAt(j))
			cnt++;
			
			j++;
			return jloop(j,i,cnt,s1);
		}
		return cnt;
		
	}
		
		
		
	/*	for(int i=0;i<s1.length();i++)
		{
			int cnt=0;
			for(int j=0;j<i;j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					cnt++;
				}
			}
			if(cnt>0)
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);*/

	}


