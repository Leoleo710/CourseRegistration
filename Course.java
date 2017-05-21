
import java.util.ArrayList;
import java.util.List;


public class Course implements Courses{

	private String courseID;
	private String courseName;
	private List<Course> courseList = new ArrayList<Course>();

	public Course(){
		
	}
	
	public Course(String courseID, String courseName){
		this.courseID = courseID;
		this.courseName = courseName;
	}
	
	public Course(String courseID){
		this.courseID = courseID;
	}
	/**
	 * @return the courseID
	 */
	public String getCourseID() {
		return courseID;
	}

	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName the courseName to set
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/*
	 * This method is to add courses that is not related to registration.
	 */
	@Override
	public void addCourse(String courseID,String courseName) {
		courseList.add(new Course(courseID,courseName));		
	}

	/*
	 * This method is to cancel courses that is not related to registration.
	 */
	@Override
	public void cancelCourse(String courseID) {
		courseList.remove(new Course(courseID));			
	}

	/*
	 * This method is to print out all courses that is not related to registration.
	 */
	@Override
	public void printCourse() {
		for(Course c : courseList){
			System.out.println("Course ID: " + c.getCourseID() + " Course Name: " + c.getCourseName());
		}
		
	}

}
