package kodlama.ioHomePage.entities;

public class Course {
	
	private int id;
	private String courseName;
	private String Description;
	private String courseStartDate;
	private double coursePrice;
	
	
	public Course() {

	}
	public Course(int id, String courseName, String description, String courseTutorName, String courseStartDate,
			double coursePrice, String categoryName) {
		super();
		this.id = id;
		this.courseName = courseName;
		Description = description;
		this.courseStartDate = courseStartDate;
		this.coursePrice = coursePrice;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public double getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
	
	
	
	

}
