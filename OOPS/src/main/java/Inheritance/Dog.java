package Inheritance;

public class Dog extends Animal {
	String breed="German shepard";
	public void dogdetails()
	{
		
		System.out.println("Breed:" +breed);
		
		
	}
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.details();
		d.dogdetails();
		
		
		
		
	}

}
