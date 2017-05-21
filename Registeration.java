

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Registeration extends Course{

	private static Map<Course, Student> registerTable = new HashMap<Course, Student>();

	/*
	 * This method is to register courses.
	 * @param course object of Course
	 * @param student object of Student
	 * 
	 */
	public void register(Course course, Student student) {
		registerTable.put(course, student);
	}

	/*
	 * This method is to cancel courses.
	 * @param courseID the id of course canceled
	 * @param studentName the name of the student
	 */
	public void cancel(String courseID,String studentName){
		Set<Entry<Course, Student>> courseset = registerTable.entrySet();
		Iterator <Map.Entry<Course, Student>> iterator = courseset.iterator();
		while(iterator.hasNext()){
			Map.Entry<Course, Student> entry = (Map.Entry<Course, Student>) iterator  
                    .next();  
            Course key = entry.getKey();  
            Student valueString = entry.getValue();  
			if(key.getCourseID().equals(courseID) && valueString.getName().equals(studentName)){
				iterator.remove();
			}			
		}
	}
	
	/*
	 * This method is to print out all course name and student registered that course.
	 */
	public void printEntry() {
		Set<Course> courseset = registerTable.keySet();
		for (Course c : courseset) {
			System.out.println(c.getCourseName() + " "
					+ registerTable.get(c).getName());
		}
	}

	/*
	 * This method is to print out all student name that registered the specific course.
	 * @param courseID the course id 
	 */
	public void printStudent(String courseID) {
		Set<Course> courseset = registerTable.keySet();
		for (Course c : courseset) {
			if (c.getCourseID().equals(courseID)) {
				System.out.println(registerTable.get(c).getName());
			}
		}
	}
}
