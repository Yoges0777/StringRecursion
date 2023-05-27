package StringRecursion;

public class SortNumbersString
{

	public static void main(String[] args) 
	{
	    String s1="34512";
	    char[] ch=s1.toCharArray();
	    
	    loop1(0,ch);
	    print(0,ch);
	}
	private static void print(int i, char[] ch)
	{
		 if(i<ch.length)
		 {
			 System.out.print(ch[i]+" ");
			 
			 i++;
			 print(i,ch);
		 }
	}
	private static void loop1(int i, char[] ch)
	{
		if(i<ch.length)
		{
	      loop2(0,i,ch);
	      i++;
	      loop1(i,ch);
		}
	}
	private static void loop2(int j, int i, char[] ch) 
	{
		 if(j<ch.length-1)
		 {
			  if(ch[j]>ch[j+1])
			  {
				  char temp=ch[j];
				  ch[j]=ch[j+1];
				  ch[j+1]=temp;
			  }
			 
			 j++;
			 loop2(j,i,ch);
		 }
	}
}    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  /*  char []a=s1.toCharArray();
	    
	    for(int i=0;i<a.length;i++)
	    {
	    	for(int j=i+1;j<a.length;j++)
	    	{
	    		if(a[i]>a[j])
	    		{
	    			char temp=a[i];
	    			a[i]=a[j];
	    			a[j]=temp;
	    		}
	    	}
	    }
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	}*/


