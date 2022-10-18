package assignments.Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] runningNumbers= {1,2,3,4,5,6,7,9,10};
		int count=1;
		List<Integer> values=new ArrayList<Integer>(Arrays.asList(runningNumbers));
		Set<Integer> set=new TreeSet<Integer>(values);
		
		for(int num:set)
		{
			if(num==count)
			{
				count++;
				continue;
			}
			else
			{
				System.out.println("The missing number is " + count);
				break;
			}
		}
		
	}

}
