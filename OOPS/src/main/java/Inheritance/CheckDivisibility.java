package Inheritance;

public class CheckDivisibility extends Addition {
	public CheckDivisibility(int num1, int num2)
	{
		super(num1,num2);
		
	}
	public boolean isDivisibleBy10()
	{
		int additionResult=super.AdditionResult();
		return additionResult % 10==0;
		
	}
	
	public void printResult()
	{
		int additionResult=super.AdditionResult();
		if(isDivisibleBy10())
		{
			System.out.println("The addition result "+ additionResult+ " is divisible by 10.");
			
		}
		else
		{
			System.out.println("The addition result "+ additionResult+ " is not divisible by 10.");
			
		}
	}
	public static void main(String args[])
	{
		
	
	if(args.length ==2)
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
	
	
		CheckDivisibility cd=new CheckDivisibility(num1,num2);
		cd.printResult();
		
	}
	else
	{
		System.out.println("Please provide two integers as arguments.");
	}
	
	}
}

	
