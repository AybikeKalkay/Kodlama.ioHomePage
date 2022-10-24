package kodlama.ioHomePage.dataAccess.Course;

import kodlama.ioHomePage.entities.Course;


public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Added to database with JDBC.");
		
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

}
