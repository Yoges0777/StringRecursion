package StringRecursion;
import java.util.Arrays;

public class ReverseEveryWordInString {

	public static void main(String[] args) 
	{
		String s="you are very very good";
		String []s1=s.split(" ");
		
		int i=0;
		iloop(i,s,s1);
		System.out.println(Arrays.toString(s1));
		
	}

	private static void iloop(int i, String s, String[] s1) 
	{
		if(i<s1.length)
		{
			String s2=s1[i];
			String newString="";
			
			int j=s2.length()-1;
	     	newString=jloop(j,s2,newString);
	     	s1[i]=newString;
			System.out.print(newString+" ");
			i++;
			iloop(i,s,s1);
		}
	}

	private static String jloop(int j, String s2,String newString) 
	{
		if(j>=0)
		{
			newString=newString+s2.charAt(j);
			
			j--;
			return jloop(j,s2,newString);
		}
		return newString;
	}
}
		
		
		
		
		/*String s="you all are very very good student";
		String []s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			
			String s2=s1[i];
			String newString="";
			 for(int j=s2.length()-1;j>=0;j--)
			 {
				 newString=newString+s2.charAt(j);
			 }
			 s1[i]=newString;
			 System.out.print(s1[i]+" ");
		}*/

	
