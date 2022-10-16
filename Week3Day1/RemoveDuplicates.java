package assignments.Week3Day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] ch=text.split(" "),ch1 = text.split(" ");		
		
		  for(int i =0;i<ch.length;i++) {
		  
			  for(int j=i+1;j<ch.length;j++)
			  {
				  if(ch[i].equals(ch[j]))
				  {
					  count=count+1;
					  ch1[i]=ch1[i].replace(ch[i],"");
				  }
			  }
		  }
		  for(int k=0;k<ch1.length;k++)
		 System.out.println(ch1[k]);
	}

}
