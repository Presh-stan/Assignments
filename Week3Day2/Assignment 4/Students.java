package assignments.Week3Day2;

public class Students {
	public void getStudentInfo(int id){
		System.out.println("The student id is :" +id);
	}
	
	public void getStudentInfo(int id, String name){
		System.out.println("The student id is :" +id + " Name is : " +name);
	}
	public void getStudentInfo(String email, long phonenumber){
		System.out.println("The student email is :" +email + " Ph.no is : " +phonenumber);
	}
}
