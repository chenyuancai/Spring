package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
		return "one";
	}
	
	@RequestMapping("/inStudent")
	 public void save(Student student, HttpServletRequest request, HttpServletResponse response) throws IOException {
		Integer n = studentService.inStudent(student);
		if(n == 1) {
			response.sendRedirect(request.getContextPath()+"/findall");
		}
		
		return;
	}
	
	@RequestMapping("/findall")
	public String findall(ArrayList<Student> student, Model model) {
		System.out.println("1");
		student = studentService.findall();
		for(int i =0 ;i<student.size();i++) {
			System.out.println(student.get(i));
		}
		model.addAttribute("ll", student);
		return "student";
	}
	
	//url接收数据
	@RequestMapping("/delstu")
	public void delstu(@RequestParam ("id") Integer id,HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(id);
		Integer n = studentService.delstu(id);
		if(n == 1) {
			response.sendRedirect(request.getContextPath()+"/findall");
		}
		return;
	}
	
	//作为更新的中间跳转
	@RequestMapping("/goupd")
	public String goupd(@RequestParam ("id") Integer id, Model model) {
		Integer iid = studentService.goupd(id);
		System.out.println("iid:"+iid);
		model.addAttribute("id", iid);
		System.out.println("即将去往upd...");
		return "upd";
	}
	
	//更新数据
	@RequestMapping("/updstu")
	public void updstu(Student student, Model model,HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("来到修改层...");
		System.out.println(student.getName());
		Integer n = studentService.updstu(student);
		System.out.println(n);
		response.sendRedirect(request.getContextPath()+"/findall");
		return;
	}
}
