package assignments.Week3Day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {4,3,6,8,29,1,2,4,7, 7,8};
		Set<Integer> set=new TreeSet<Integer>();
		for(int i =0;i<data.length;i++) {
			for(int j =i+1;j<data.length;j++)
			{
				if(data[i]==data[j])
					System.out.println("The Duplicate numbers are :" + data[i]);
		
			}
		}
		
		for(int i=0;i<data.length;i++) {
			if(set.contains(data[i]))
				System.out.println("The Duplicates in the set are " +data[i]);
			else
			set.add(data[i]);
			
		}
	}

}
