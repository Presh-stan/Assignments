package week1.day1.Assignment4;

public class Car {

	public void applyBreak(String n)
	{
		System.out.println("Applied break for " + n);
	}
	public void soundHorn(String m)
	{
		System.out.println("Sound horn for " + m);
	}
  public static void main(String[] args) {
	Bike b=new Bike();
	b.applyBreak("Bike");
	b.soundHorn("Bike");
}
}
