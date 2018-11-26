package com.studentTest;

public class StudentTest {

	private String subjectName;
	private String subjectMark;

	public StudentTest() {
		// TODO Auto-generated constructor stub
	}

	public StudentTest(String subjectName, String subjectMark) {
		super();
		this.subjectName = subjectName;
		this.subjectMark = subjectMark;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectMark() {
		return subjectMark;
	}

	public void setSubjectMark(String subjectMark) {
		this.subjectMark = subjectMark;
	}

	@Override
	public String toString() {
		return "StudentTest [subjectName=" + subjectName + ", subjectMark=" + subjectMark + "]";
	}

}
