package kodlama.ioHomePage.business;

import kodlama.ioHomePage.core.logging.course.Logger;
import kodlama.ioHomePage.dataAccess.Course.CourseDao;
import kodlama.ioHomePage.entities.Course;

public class CourseManager {
	
	private CourseDao courseDao;
	private Logger [] loggers;
 
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}



	public void add(Course course) throws Exception {
		if(course.getCoursePrice() < 0 ) {
			throw new Exception ("Kurs fiyatı 0'dan küçük olamaz.");
		}
		courseDao.add(course);
		

		for (Logger logger : loggers) {
			logger.log(course.getCourseName() + course.getDescription());
		}
		
		
	
		
		
	}

	

}
