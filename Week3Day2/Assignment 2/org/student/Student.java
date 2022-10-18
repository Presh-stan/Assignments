package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Preshya");
	}
	public void studentDept() {
		System.out.println("Student Dept CSE");
	}
	public void studentId() {
		System.out.println("09FF100");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.departmentName();
		s.studentName();
		s.studentDept();
		s.studentId();

	}

}
