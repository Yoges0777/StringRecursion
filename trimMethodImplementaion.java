package StringRecursion;
public class trimMethodImplementaion {
	public static void main(String[] args) 
	{	String s1="  abcd abd   ";
		char ch=' ';
		int start=0;
		int end=s1.length()-1;
		String s2="";
		int []result=new int[2];

		iloop(0,s1,start,end,s2,result,ch);
		System.out.println(result[0]);System.out.println(result[1]);
		start=result[0];  end=result[1];
		s2=print(s2,s1,start,end);
		System.out.println(s2);
	}
	private static String print(String s2, String s1, int start, int end) 
	{
		if(start<=end)
		{
			s2=s2+s1.charAt(start);
			start++;
			s2=print(s2, s1, start, end);
		}
		return s2;
	}
	private static void iloop(int i, String s1, int start, int end, String s2, int[] result, char ch) 
	{
		if(i<s1.length())
		{
			if(s1.charAt(start)==ch)
			{
				start++;
				result[0]=start;
			}
			else if(s1.charAt(end)==ch)
			{
				end--;
				result[1]=end;
			}
			else	
				return;
			i++;
			iloop(i, s1, start, end, s2, result, ch);
		}
	}
}



//else if(s1.charAt(end)==' ')




/*int start=0;
		int end=s1.length()-1;
		while(true)
		if(s1.charAt(start)==' ')
		start++;
		else if(s1.charAt(end)==' ')
		end--;
		else
		break;

		String s2="";
		for(int i=start;i<=end;i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		System.out.println("Start "+start);
		System.out.println("end "+end);*/
