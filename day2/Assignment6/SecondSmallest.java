package week1.day2.Assignment6;

public class SecondSmallest {

	public static void main(String[] args) {
		int array[] = {23,45,67,32,89,22};
		int temp=0;
		for(int i=0; i<array.length;i++)
			{for(int j=i+1; j<array.length;j++)
			{if(array[i]>array[j])
			{
				temp =array[i];
			array[i] = array[j];
			array[j]=temp;
			}}}
System.out.println("The second smallest element is " + array[1]);
	}
}
