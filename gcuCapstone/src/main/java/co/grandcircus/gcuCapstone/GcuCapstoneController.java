package co.grandcircus.gcuCapstone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.gcuCapstone.DAO.CourseDao;
import co.grandcircus.gcuCapstone.DAO.EnrollmentsDao;
import co.grandcircus.gcuCapstone.DAO.UserDao;
import co.grandcircus.gcuCapstone.entities.Course;
import co.grandcircus.gcuCapstone.entities.Student;
import co.grandcircus.gcuCapstone.entities.User;

@Controller
public class GcuCapstoneController {
	
	@Autowired
	UserDao userDao;
	@Autowired
	CourseDao courseDao;
	@Autowired
	EnrollmentsDao enrollmentsDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@PostMapping("/")
	public ModelAndView createStudent(Course course) {
		courseDao.createCourse(course);
		
		return new ModelAndView("redirect:/");
	}
	
	@RequestMapping("/courses")
	public ModelAndView viewCourses() {
		List<Course> list = courseDao.findAll();
		
		return new ModelAndView("courses", "list", list);
	}
	
	@RequestMapping("/add-course")
	public ModelAndView addCourse() {
		
		return new ModelAndView("add-course");
	}
	
	@PostMapping("/courses")
		public ModelAndView viewNewCourses(Course course) {
			courseDao.createCourse(course);
			return new ModelAndView("redirect:/courses");
		}
	@RequestMapping("/student-list")
	public ModelAndView studentList() {
		List<User> list = userDao.findAllStudents();
		
		return new ModelAndView("student-list", "list", list);
	}
	
	}

