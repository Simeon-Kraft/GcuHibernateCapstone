package co.grandcircus.gcuCapstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.gcuCapstone.DAO.CourseDao;
import co.grandcircus.gcuCapstone.DAO.EnrollmentsDao;
import co.grandcircus.gcuCapstone.DAO.UserDao;
import co.grandcircus.gcuCapstone.entities.Student;

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
	public ModelAndView createStudent(Student student) {
		userDao.createStudent(student);
		
		return new ModelAndView("redirect:/");
	}
}
