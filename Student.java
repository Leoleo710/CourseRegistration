

import java.util.List;


public class Student {

	private String studentID;
	private String name;
	private List<Student> studentList;


	public Student() {

	}

	public Student(String studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}

	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID
	 *            the studentID to set
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * This method is to print out all student that is not related to registration.
	 */
	public void printStudent() {
		for (Student s : studentList) {
			System.out.println("Student ID: " + s.getStudentID()
					+ " Student Name: " + s.getName());
		}
	}

}
