package org.student;

import org.department.Department;


public class Student extends Department {
	public void studentName() {
		System.out.println("abinesh"); }
		public void studentDept() {
			System.out.println("science"); }
			public void studentId() {
				System.out.println("3"); }
	public static void main(String[] args) {
		Student aravind = new Student();
		aravind.collegeCode();
		aravind.collegeName();
		aravind.collegeRank();
		aravind.deptName();
		aravind.studentDept();
		aravind.studentId();
		aravind.studentName();
		
	}
	}


