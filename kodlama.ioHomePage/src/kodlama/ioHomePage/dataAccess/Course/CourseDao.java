package kodlama.ioHomePage.dataAccess.Course;

import kodlama.ioHomePage.entities.Course;

public interface CourseDao {
	
	void add (Course course);
	
	void delete (Course course);
	
	void update(Course course);

}
