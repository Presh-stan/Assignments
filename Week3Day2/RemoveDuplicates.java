package assignments.Week3Day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="PayPal India";
		char[] ch=input.toCharArray();
		
		//List<Character> li=new ArrayList<Character>(Arrays.asList(ch));
		Set<Character> charSet=new HashSet<Character>();
		Set<Character> dupCharSet =new HashSet<Character>();

		for(int i=0;i<ch.length;i++)
		{
			if(charSet.contains(ch[i]))
				{dupCharSet.add(ch[i]);
		//	charSet.remove(ch[i]);
				System.out.println(dupCharSet);
				}
			else
				charSet.add(ch[i]);
		}

		for(int i=0;i<ch.length;i++)
		{
			if(dupCharSet.contains(ch[i]))
			{
				charSet.remove(ch[i]);
			}
		}
		System.out.println(charSet);
		for(int i=0;i<charSet.size();i++)
		{if(ch[i]==' ')
		{
			charSet.remove(ch[i]);
		}}
System.out.println(charSet);
	}

}
