package assignments.Week3Day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="madam";
		String text2="daamm";
		
		if(text1.length()==text2.length())
		{
			char[] ch1=text1.toCharArray();
			char[] ch2=text2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch1, ch2);
					if(result) {
				System.out.println("The strings are anagram");
			}
			else
				System.out.println("They are not an anagram");
		}
		else
			System.out.println("Not an anagram");
	}}