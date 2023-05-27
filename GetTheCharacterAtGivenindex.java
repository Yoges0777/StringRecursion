package StringRecursion;

public class GetTheCharacterAtGivenindex {

	public static void main(String[] args) 
	{
		String s1="abcd";
		int index=1;
		int cnt=0;
		int i=0;
	cnt=iloop(i,index,s1,cnt);
	if(cnt==0)
		System.out.println("out of range");
	}
	private static int iloop(int i,int index,String s1,int cnt)
	{
		if(i<s1.length())
		{
			if(index==i)
			System.out.println(s1.charAt(i));
			cnt++;
			
			i++;
			return iloop(i,index,s1,cnt);
		}
		return cnt;
	}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
		
		/*char[]a=s1.toCharArray();
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==index)
			{
				System.out.println(i);
				cnt++;
			}
			if(cnt==0)
				System.out.println("out of range");
		}*/
		
	}


