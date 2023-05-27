package StringRecursion;

import Array.character;
import ArrayRecu.interleavingOftwoArray;
import Gto.return1;

public class SumOfdigitPresenTInString {

	public static void main(String[] args) 
	{
		String s1="yog14es45h";
		int sum=0;
		
				sum=loop1(0,s1,sum);
				System.out.println(sum);

	}

	private static int loop1(int i, String s1,int sum) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				char ch=(char)(s1.charAt(i)-48);
				sum=sum+ch;
			}
			
			i++;
			return loop1(i, s1,sum);
		}
		return sum;
	}

}
