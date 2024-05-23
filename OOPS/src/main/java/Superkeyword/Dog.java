package Superkeyword;

public class Dog extends Animal {
	String Breed="Bulldog";
	public Dog(String color)
	{
		super(25);
		
		System.out.println("Dog Child class: " + color);
		
	}
	


public void Details()
{
	super.Details();
	super.sleep();
	System.out.println("Animal is Eating");
	System.out.println("Breed");
	System.out.println(super.Breed);
	
}
public static void main(String args[])
{
	Dog d= new Dog("Black");
	d.Details();
	
}
	
}
