package StringRecursion;

public class Split {

	public static void main(String[] args) 
	{
		String s1="abc efg ijk lmn";
		char ch=' ';
		
		int cnt=0;
		int i=0;
		cnt=iloop(i,s1,ch,cnt);
		String []sa=new String[cnt+1];
		String newString="";
		int index=0;
		int k=0;
		kloop(k,index,s1,ch,newString,sa);
		
		int l=0;
		loopl(l,s1,sa);
	}

	private static void loopl(int l, String s1, String[] sa) 
	{
		if(l<sa.length)
		{
			System.out.print(sa[l]+" ");
			l++;
			loopl(l,s1,sa);
		}
		
	}

	private static void kloop(int k, int index, String s1, char ch, String newString, String[] sa) 
	{
		if(k<s1.length())
		{
			if(s1.charAt(k)!=ch)
			{
				newString=newString+s1.charAt(k);
			}
			else
			{
				sa[index++]=newString;
				newString="";
			}
			sa[index]=newString;
			
			k++;
			kloop(k,index,s1,ch,newString,sa);
		}
		
	}

	private static int iloop(int i, String s1, char ch,int cnt) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)==ch)
			{
				cnt++;
			}
			i++;
			return iloop(i,s1,ch,cnt);
		}
		return cnt;
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	   /*String s1="abc efg ijk lmn";
		char ch=' ';
		
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
			{
				cnt++;
			}
		}
		String []sa=new String [cnt+1];
		String newString="";
		int index=0;
		for(int i=0;i<s1.length();i++)
		{
		  if(s1.charAt(i)!=ch)
		  {
			  newString=newString+s1.charAt(i);
		  }
		  else
		  {
			  sa[index++]=newString;
			  newString="";
		  }
		  sa[index]=newString;
		}
		for (int i = 0; i < sa.length; i++) 
		{
			System.out.print(sa[i]+" ");
		}*/

	

























