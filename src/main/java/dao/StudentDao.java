package dao;

import java.util.ArrayList;

import po.Student;

public interface StudentDao {
	public Student findStudentById(Integer id);
	
	public Integer inStudent(Student student);
	
	public ArrayList<Student> findall();
	
	public Integer delstu(Integer id);
	
	public Integer updstu(Student student);
	
	public Integer  goupd(Integer id);
}
