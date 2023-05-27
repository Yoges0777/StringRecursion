package StringRecursion;
import java.util.Arrays;

public class CharArraConataining2 {

	public static void main(String[] args) 
	{
		String s1="yogesh";
		char []a=new char[s1.length()];

		int i=0;
		a=iloop(i,s1, a);
		System.out.println(Arrays.toString(a));

		int k=0;
		kloop(k,a);
	}

	private static void kloop(int k, char[] a) 
	{
		if(k<a.length)
		{
            System.out.print(a[k]+" ");
		
		k++;
		kloop(k,a);}
	}

	private static char [] iloop(int i, String s1,char []a) 
	{
		if(i<s1.length())
		{
			a[i]=s1.charAt(i);
			i++;
			iloop(i,s1,a);
		}
		return a;

	}
}




































/*char []a=new char[s1.length()];


		for(int i=0;i<s1.length();i++)
		{
			a[i]=s1.charAt(i);
		}
		System.out.println(Arrays.toString(a));

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}*/



