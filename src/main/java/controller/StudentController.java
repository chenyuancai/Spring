package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import po.Student;
import service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@RequestMapping("/findStudentById")
	public String findStudentById(Integer id, Model model) {
		Student student = studentService.findStudentById(id);
		model.addAttribute("student", student);
		return "student";
	}
}
