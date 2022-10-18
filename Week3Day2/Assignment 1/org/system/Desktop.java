package org.system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("The desktop size is 16\" ");
	}
	
	public static void main(String args[])
	{
	Desktop desktop=new Desktop();
	desktop.computerModel();
	desktop.desktopSize();
	}
}
