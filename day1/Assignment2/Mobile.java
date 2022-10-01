package week1.day1.Assignment2;

public class Mobile {

	public void makeCall()
	{
		String mobileModel ="Samsung";
		float mobileWeight = 350.75f ;
		System.out.println("Mobile model  : " + mobileModel );
		System.out.println("Mobile weight : " + mobileWeight );
	}
	public void sendMsg()
	{
		boolean fullCharged =true;
		int mobileCost= 20000;
		System.out.println("Full Charged  : " + fullCharged);
		System.out.println("Mobile cost   : " + mobileCost);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Mobile m = new Mobile();
     System.out.println("This is my mobile");
     m.makeCall();
     m.sendMsg();
	}

}
