package assignments.Week3Day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="madam";
		String rev="";
		char[] ch=value.toCharArray();
		for(int i=value.length()-1;i>=0;i--)
		{
			rev+=ch[i];
			
		}
		if(rev.equals(value))
			System.out.println("It is a palindrome");
		else
			System.out.println("Not a palindrome");
	}

}
