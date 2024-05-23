package Multilevelinheritannce;

public class Babydog extends Dog {
	String color="Black";
	
	public void color()
	{
		System.out.println("Color is :"+ color);
		
	}
	
public static void main(String args[])
{
	Babydog d=new Babydog();
	d.eat();
	d.sleep();
	d.color();
	System.out.println(d.breed);
	
	
}
}
