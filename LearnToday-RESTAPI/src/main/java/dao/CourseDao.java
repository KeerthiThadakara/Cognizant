package dao;

import java.util.List;

import model.Course;

public interface CourseDao {

	public List<Course> getAllCourses();
	
	public Course getCourseById(int id);
	
}
