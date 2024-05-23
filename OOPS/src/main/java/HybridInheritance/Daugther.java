package HybridInheritance;

public class Daugther extends Father {
	String name="Reenu";
	int age =20;
	public void Daughterdetails()
	{
		System.out.println("Name is:"+ name );
		System.out.println("Age is:"+ age );
	}
	public static void main(String args[])
	{
		Daugther d=new Daugther();
		d.display();
		d.Fatherdetails();
		d.Daughterdetails();
		Son s= new Son();
		s.Sondetails();
		s.display();
		s.Fatherdetails();
		
		
		
	}

}
