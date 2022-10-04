package week1.day2.Assignment2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, number= 34343,num,temporary=0, number1, var=0;
		num = number;
		number1 =number;
		while(number !=0)
		{
			number /=10;
			++ count;
		}


		for(int i =0;i<count;i++)
		{
			var =num%10;

			temporary =(temporary *10) + var ;

			num= num/10;
		}

		if(number1 == temporary)
			System.out.println("Palindrome number");


		else
			System.out.println("Not palindrome number");
	}

}
