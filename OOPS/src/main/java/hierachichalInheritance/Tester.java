package hierachichalInheritance;

public class Tester extends Employee {
	String name="Ram";
	int phno=56787;
	public void testerdetails()
	{
		System.out.println("Name is:"+ name);
		System.out.println("Phone no is:"+ phno);
		
		
	}
	public static void main(String args[])
	{
		Developer d= new Developer();
		d.Developerdetails();
		d.display();
		Tester t= new Tester();
		t.display();
		t.testerdetails();
		
		
	}

}
