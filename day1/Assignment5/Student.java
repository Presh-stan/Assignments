package week1.day1.Assignment5;

public class Student {

	String studentName = "Preshya";
	int rollNo = 100;
	String collegeName ="KU";
	float markScored =81.3f;
	float cgpa = 8.13f;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Student s=new Student();
 System.out.println("********Report********");
 System.out.println(s.collegeName);
 System.out.println("Student     : " + s.studentName);
 System.out.println("Roll Number : " + s.rollNo);
 System.out.println("Marks       : " + s.markScored);
 System.out.println("CGPA        : " + s.cgpa);
	}

}
