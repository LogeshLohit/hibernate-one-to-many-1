package com.studentTest;

import java.util.List;

public class Student {

	private String studentId;
	private String studentName;
	private List<StudentTest> studentResult;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String studentId, String studentName, List<StudentTest> studentResult) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentResult = studentResult;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<StudentTest> getStudentResult() {
		return studentResult;
	}

	public void setStudentResult(List<StudentTest> studentResult) {
		this.studentResult = studentResult;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentResult=" + studentResult
				+ "]";
	}

}
