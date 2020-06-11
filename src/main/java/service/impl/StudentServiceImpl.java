package service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.StudentDao;
import po.Student;
import service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	
	public Student findStudentById(Integer id) {
		System.out.println("查询...");
		return this.studentDao.findStudentById(id);
	}


	public Integer inStudent(Student student) {
		System.out.println("保存...");
		return studentDao.inStudent(student);
	}

	public ArrayList<Student> findall() {
		System.out.println("查询全部...");
		
		return studentDao.findall();
	}
	
	public Integer delstu(Integer id) {
		System.out.println("删除...");
		
		return studentDao.delstu(id);
	}
	
	public Integer goupd(Integer id) {
		System.out.println("查询id...");
		System.out.println(id);
		return studentDao.goupd(id);
	}


	public Integer updstu(Student student) {
		System.out.println("更新...");
		return studentDao.updstu(student);
	}
}
