package Inheritance;
import java.util.*;


public class Employee {
	double basicpay;
	double deduction;
	double bonus;
	
	public Employee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic pay:");
		this.basicpay=sc.nextDouble();
		System.out.println("Enter the deduction:");
		this.deduction=sc.nextDouble();
		System.out.println("Enter the bonus:");
		this.bonus=sc.nextDouble();
		
		
		}

}
