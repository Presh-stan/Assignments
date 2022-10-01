package week1.day1.Assignment4;

public class Bike {

	public void applyBreak(String n)
	{
		System.out.println("Applied break for " + n);
	}
	public void soundHorn(String m)
	{
		System.out.println("Sound horn for " + m);
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.applyBreak("Car");
		c.soundHorn("Car");
      
	}


}
