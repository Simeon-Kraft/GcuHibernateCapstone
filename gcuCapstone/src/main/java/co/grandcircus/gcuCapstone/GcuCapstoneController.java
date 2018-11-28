package co.grandcircus.gcuCapstone;

import org.springframework.stereotype.Controller;

import co.grandcircus.gcuCapstone.DAO.CourseDao;
import co.grandcircus.gcuCapstone.DAO.EnrollmentsDao;
import co.grandcircus.gcuCapstone.DAO.UserDao;

@Controller
public class GcuCapstoneController {
	
	UserDao userDao;
	CourseDao courseDao;
	EnrollmentsDao enrollmentsDao;
}
