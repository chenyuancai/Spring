package service;

import java.util.ArrayList;

import po.Student;

public interface StudentService {
	public Student findStudentById(Integer id);
	
	public Integer inStudent(Student student);
	
	public ArrayList<Student> findall();
	
	public Integer delstu(Integer id);
	
	public Integer  goupd(Integer id);
	
	public Integer updstu(Student student);
}
