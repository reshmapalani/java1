import java.util.Scanner;
class palindrome1
{
	public static void main(String arg[])	
	{
	    	String str,rev="";
            	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter a string :");
           	str=sc.next();
	    	for(int i=str.length()-1;i>=0;i--)
	    	{
	    		rev=rev+str.charAt(i);
	    	}
			System.out.println("Reverse of a string is : "+rev);
			if(rev.equals(rev))
				System.out.println("Entered string is palindrome");
        		else
				System.out.println("Entered string is not a palindrome");           
	}
}
