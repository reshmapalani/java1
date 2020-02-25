import java.util.Scanner;

class palindrome
{
	public static void main(String args[])
	{
		int Number, Temp, Reminder, Reverse = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter any number to Check for Palindrome: ");
		Number = sc.nextInt();
		Temp = Number;
		while(Temp > 0) 
		{
			Reminder = Temp %10;
			Reverse = Reverse * 10 + Reminder;
			Temp = Temp /10;
		}
		System.out.format("Reverse of entered number is = %d\n", Reverse);
		if(Number == Reverse)	
		{
			System.out.format("%d is Palindrome.", Number);
		}
		else
		{
			System.out.format("%d is Not a Palindrome.", Number);
		}
	}
}
