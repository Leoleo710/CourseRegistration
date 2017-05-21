

public class CourseTest {

	public static void main(String[] args) {

		Student student = new Student("123","Mike");
		Student student2 = new Student("124","Mary");
		
		Registeration r = new Registeration();
		// register courses
		r.register(new Course("comp223","ABC"), student);
		r.register(new Course("comp224","ABD"), student2);
		r.register(new Course("comp224","ABD"), student);
		// print out all info: course and student name
		r.printEntry();
		// search the student that registered the specific course
		r.printStudent("comp224");
		// cancel couse
		r.cancel("comp224", "Mike");
		// print out all info: course and student name
		r.printEntry();
	}

}
