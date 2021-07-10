package service;

import java.util.List;

import model.Course;

public interface CourseService {

	public List<Course> getAllCourses();

	public Course getCourseById(int id);

}
