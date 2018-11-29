package co.grandcircus.gcuCapstone;

import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.grandcircus.gcuCapstone.DAO.CourseDao;
import co.grandcircus.gcuCapstone.DAO.EnrollmentsDao;
import co.grandcircus.gcuCapstone.DAO.UserDao;
import co.grandcircus.gcuCapstone.entities.Admin;
import co.grandcircus.gcuCapstone.entities.Course;
import co.grandcircus.gcuCapstone.entities.Enrollments;
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
	public ModelAndView createStudent(@RequestParam("username") String username,
			@RequestParam("password") String password, RedirectAttributes redir, HttpSession session) {
		User student = new Admin();
		
		try {
			student = (Student) userDao.findByUserName(username);
		}catch(NoResultException e) {
			redir.addFlashAttribute("message", "Incorrect username or password");
			return new ModelAndView("redirect:/");
		}
		
		if (!student.getPassword().equals(password)) {
			redir.addFlashAttribute("message", "Incorrect username or password");
			return new ModelAndView("redirect:/");
		}
		
		if (student.isAdmin()) {
			session.setAttribute("student", student);
			return new ModelAndView("courses");
		}
		
		Student s = new Student();
		s = (Student) student;
		
		List<Enrollments> list = enrollmentsDao.findByStudent(s);
		session.setAttribute("student", student);
		return new ModelAndView("student-page", "list", list);
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

	@RequestMapping("/add-student")
	public ModelAndView addStudent() {
		return new ModelAndView("add-student");
	}

	@PostMapping("/student-list")
	public ModelAndView newLists(Student student) {
		userDao.createStudent(student);
		return new ModelAndView("redirect:/student-list");
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

	@RequestMapping("/delete/{id}")
	public ModelAndView deleteStudent(@PathVariable("id") Long id) {
		userDao.deleteStudent(id);
		return new ModelAndView("redirect:/student-list");
	}
	
	@RequestMapping("/create-admin")
	public ModelAndView addAdmin() {
		return new ModelAndView("create-admin");
	}
	
	@PostMapping("/create-admin")
	public ModelAndView createAdmin(@RequestParam("username") String username, @RequestParam("password") String password
			, @RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
		User a = new Admin(username, password, firstName, lastName, true);
		userDao.createAdmin((Admin) a);
		
		return new ModelAndView("redirect:/");
	}

}
