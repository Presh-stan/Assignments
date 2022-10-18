package assignments.Week3Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		int temp=0;
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{for(int j=i+1;j<data.length;j++)
			{if(data[i]>data[j])
			{
				temp=data[i];
				data[i]=data[j];
				data[j]=temp;
			}
		}
	}
		for(int k=0;k<data.length;k++)
		{
			set.add(data[k]);
		}
		
		  
		  list.addAll(set);
		  
		  System.out.println("The second element is " + list.get(list.size()-2));
		 
		}

}
