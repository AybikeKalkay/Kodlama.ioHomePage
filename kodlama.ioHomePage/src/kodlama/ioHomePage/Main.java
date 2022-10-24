package kodlama.ioHomePage;

import kodlama.ioHomePage.business.CategoryManager;
import kodlama.ioHomePage.business.CourseManager;
import kodlama.ioHomePage.core.logging.category.DatabaseLoggerCategory;
import kodlama.ioHomePage.core.logging.category.FileLoggerCategory;
import kodlama.ioHomePage.core.logging.category.LoggerCategory;
import kodlama.ioHomePage.core.logging.category.MailLoggerCategory;
import kodlama.ioHomePage.core.logging.course.DatabaseLogger;
import kodlama.ioHomePage.core.logging.course.FileLogger;
import kodlama.ioHomePage.core.logging.course.Logger;
import kodlama.ioHomePage.core.logging.course.MailLogger;
import kodlama.ioHomePage.dataAccess.Category.HibernateCategoryDao;
import kodlama.ioHomePage.dataAccess.Course.CourseDao;
import kodlama.ioHomePage.dataAccess.Course.JdbcCourseDao;
import kodlama.ioHomePage.entities.Category;
import kodlama.ioHomePage.entities.Course;
import kodlama.ioHomePage.entities.Tutor;

public class Main {

	public static void main(String[] args) throws Exception {
	
		Course course = new Course();
		 course.setId(1);
		 course.setCourseName("(2022) Yazılım Geliştirici Yetiştirme Kampı (JAVA)");
		 course.setDescription("Profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.");
		 course.setCourseStartDate("14 Eylül 2022");
		 course.setCoursePrice(99.99);
	
		Logger [] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()}; 	
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);		
		courseManager.add(course); 
		
		Tutor tutor = new Tutor();
		tutor.setTutorName("Engin Demiroğ");
		
			
	
		
		Category category = new Category();
		category.setCategoryName("Programlama");
		
		LoggerCategory [] loggers1 = {new DatabaseLoggerCategory(), new FileLoggerCategory(), new MailLoggerCategory()};
		
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers1);
		categoryManager.add(category);
		
		
	}

}
