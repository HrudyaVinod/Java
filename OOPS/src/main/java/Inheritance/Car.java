package Inheritance;

public class Car extends Vehicle {
	int carspeed=80;
	public void  speed()
	{
		System.out.print("vehicle class");
		
	}
	
	public static void main(String args[])
	{
		Car c=new Car();
		c.run();
		c.speed();
		System.out.println(c.carspeed);
		System.out.println(c.speed);
		
	}
	

}


