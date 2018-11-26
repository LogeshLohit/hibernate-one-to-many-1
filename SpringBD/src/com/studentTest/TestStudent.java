package com.studentTest;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTest studentOneResult = new StudentTest("maths", "55");
		List<StudentTest> studentOne = new ArrayList<>();
		studentOne.add(studentOneResult);

		StudentTest studentTwoResult = new StudentTest("maths", "75");
		StudentTest studentTwoSubJTwo = new StudentTest("Science", "75");
		List<StudentTest> studentTwo = new ArrayList<>();
		studentTwo.add(studentTwoSubJTwo);
		studentTwo.add(studentTwoResult);

		Student studentArun = new Student("101", "Arun", studentOne);
		Student studentBharth = new Student("101", "Bharath", studentTwo);

		System.out.println(studentArun);
		System.out.println(studentBharth);

	}

}
