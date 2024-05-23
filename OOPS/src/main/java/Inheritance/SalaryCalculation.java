package Inheritance;

public class SalaryCalculation extends Employee {
	double hra;
	double pf;
	
	public SalaryCalculation()
	{
		super();
		this.hra=0.05 * this.basicpay;
		this.pf=0.20*this.basicpay;
		
		
	}

}
