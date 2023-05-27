package StringRecursion;

public class SumOFdigitPresentString {

	public static void main(String[] args) 
	{
		String s1="1sjk1d1f4f7";
		int sum=0;
		sum=iloop(0,s1,sum);
		System.out.println(sum);
	}

	private static int iloop(int i, String s1,int sum) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				char ch=(char)(s1.charAt(i)-48);
				sum=sum+ch;
			}
			i++;
			return iloop(i,s1,sum);

		}
		return sum;
	}





































	/*int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				char ch=(char)(s1.charAt(i)-48);
				sum=sum+ch;
			}
		}
		System.out.println(sum);*/
}


