package com.company;

public class Main {

    public static void main(String[] args) {
	Moodle hw = new Moodle();
	hw.addAssignment("Assignment 1");
	hw.addAssignment("Assignment 2");

	Observer student = new Student("Jim");
	Observer student2 = new Student("Ali");
	hw.registerStudent(student);
	hw.registerStudent(student2);

	hw.addAssignment("Assignment 3");
	hw.removeAssignment("Assignment 1");








	}
}
