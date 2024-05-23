package Inheritance;

public class SalarySlip extends SalaryCalculation {
	double totalSalary;
	
	public SalarySlip() 
	{
		super();
		this.totalSalary=this.basicpay+this.hra-this.pf-this.deduction+this.bonus;
		
	}
	public void printSalarySlip()
	{
		System.out.println("Salary Slip:");
		System.out.println("Basic pay:" +this.basicpay);
		System.out.println("Deduction:"+this.deduction);
		System.out.println("HRA:"+ this.hra);
		System.out.println("PF:"+ this.pf);
		System.out.println("Bonus:"+this.bonus);
		System.out.println("Total Salary by hand:"+this.totalSalary);
		
		
		
	}
	public static void main(String args[])
	{
		SalarySlip sp=new SalarySlip();
		sp.printSalarySlip();
	}

}
