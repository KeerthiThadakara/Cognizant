package service;

import java.util.List;

import model.Course;
import model.Student;

public interface StudentService {

	public List<Course> getAllCourses();
	
	public boolean postStudent(Student s);
	
	public boolean deleteStudent(int enrollmentId);
	
}
