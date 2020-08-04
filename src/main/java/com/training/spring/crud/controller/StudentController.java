package com.training.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.spring.crud.dao.StudentDAOInterface;
import com.training.spring.crud.model.Student;


@Controller
public class StudentController {
	
	@Autowired
	private StudentDAOInterface studentdao;
	
	@RequestMapping(value ="/enroll", method = RequestMethod.GET)
		public ModelAndView studentEnroll() 
		{
			ModelAndView mv = new ModelAndView();
			mv.setViewName("studentenroll");
			return mv;
		}
	
	@RequestMapping(value ="/register", method = RequestMethod.POST)
		public String studentRegister(@ModelAttribute("student") Student student) 
		{
			System.out.println("student name: "+ student.getName());
			studentdao.studentAdd(student);
			System.out.println("Congratulations " +student.getName()+ " registered successfuly");
			return "redirect:/allstudents";
		}
	
	@RequestMapping(value ="/allstudents", method = RequestMethod.GET)
		public ModelAndView AllStudents(@ModelAttribute("student") Student student) 
		{
			List<Student> studentlist = studentdao.getAllStudents();
			ModelAndView mv = new ModelAndView("allstudents");
			mv.addObject("students", studentlist);
			return mv;
		}
	
	 @RequestMapping(value = "/edit/{id}")
	    public ModelAndView editStudent(@ModelAttribute("student") Student student,@PathVariable("id") int id)
	    {
	        ModelAndView mv = new ModelAndView("editstudent");        
	        student = studentdao.getStudentById(id);   
	        mv.addObject("student",student);                
	        return mv;
	    }
	 
	 @RequestMapping(value = "/update", method=RequestMethod.POST)
	    public String UpdateStudent(@ModelAttribute("student") Student student)
	    {             
	        studentdao.updateStudent(student);                  
	        return "redirect:/allstudents";
	    }

	 @RequestMapping(value = "/delete/{id}")
	    public ModelAndView UpdateStudent(@ModelAttribute("student") Student student,@PathVariable("id") int id)
	    {   
		    System.out.println("into delete controller");
	        studentdao.deleteStudent(id);   
	        System.out.println("returning to all students");
	        return new ModelAndView ("redirect:/allstudents");
	    }
}
