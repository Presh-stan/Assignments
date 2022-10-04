package week1.day2.Assignment7;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int temp=0, arr[]= {1,2,3,4,7,6,8} ;
 for(int i=0;i<arr.length;i++)
 {
	 for(int j =i+1;j<arr.length;j++)
	 {
		 if(arr[i]>arr[j])
		 {
		 temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
	 }}}
	 int count=arr[0];
	 for(int k=0;k<arr.length;k++)
	 {
		
			
			  if(arr[k]!=count)
			  {
				  System.out.println(count);
				  break;
				  }
			  ++count;
			 
	 
 }
	}

}
