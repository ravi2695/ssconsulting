package ssconsultation1;

abstract class Vehicle
{
	public abstract void engine();
	
	public void honk()
	{
		System.out.println("every vehicle's horn honks!");
	}
}

class BMW extends Vehicle
{

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("BMW is having 2 stroke engine and 6 engines are used for boosting power!");
	}
	
}

class Ford extends Vehicle
{

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Ford is having 4 stroke engine and 4 engines are used for power boost up!");
	}
	
}

public class driverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW bmw=new BMW();
		Ford ford=new Ford();
		bmw.engine();
		ford.engine();
	}

}
