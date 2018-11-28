package co.grandcircus.gcuCapstone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import co.grandcircus.gcuCapstone.DAO.CourseDao;
import co.grandcircus.gcuCapstone.DAO.EnrollmentsDao;
import co.grandcircus.gcuCapstone.DAO.UserDao;

@Controller
public class GcuCapstoneController {
	
	@Autowired
	UserDao userDao;
	@Autowired
	CourseDao courseDao;
	@Autowired
	EnrollmentsDao enrollmentsDao;
}
