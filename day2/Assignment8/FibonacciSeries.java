
package week1.day2.Assignment8;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber=0, secondNumber=1,range=8,sum=0;

		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(int i=2;i<range;i++)
		{
			sum =firstNumber +secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			System.out.println(sum);
		}
	}

}
