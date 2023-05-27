package StringRecursion;

public class LargestAndSmallestWordInString {

	public static void main(String[] args) 
	{
		String s="abc def ghi ijkfjf";
		String []s1=s.split(" ");
		System.out.println("smalllest word    "+s1[0]);
		System.out.println("largest word      "+s1[s1.length-1]);
		
		iloop(0,s1);
	}

	private static String[] iloop(int i, String[] s1) 
	{
		if(i<s1.length)
		{
			int j=i+1;
			jloop(j,s1,i);
				
			return iloop(++i,s1);
		}
		return s1;
		
	}
	private static String[] jloop(int j, String[] s1, int i) 
	{
		if(j<s1.length)
		{
			if(s1[i].length()>s1[j].length())
			{
				String temp=s1[i];
				s1[i]=s1[j];
				s1[j]=temp;
				return jloop(++j,s1,i);
			}
		}
		return s1;
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String[]sa=s.split(" ");
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[i].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		System.out.println("smallest woed "+sa[0]);
		System.out.println("larges word "+sa[sa.length-1]);*/

