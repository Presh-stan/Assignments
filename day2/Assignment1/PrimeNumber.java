package week1.day2.Assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=13;
		boolean flag = false;
		for(int i=2;i<=number/2;i++)
		{
			int remainder =number%i;
			if(remainder == 0)
			{
				flag =true;
				break;
			}
		}
		if(flag == true)

			System.out.println(("Not a Prime"));
		else
			System.out.println("Prime");

	}

}
