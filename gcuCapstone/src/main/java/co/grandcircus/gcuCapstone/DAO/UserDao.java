package co.grandcircus.gcuCapstone.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuCapstone.entities.Admin;
import co.grandcircus.gcuCapstone.entities.Student;
import co.grandcircus.gcuCapstone.entities.User;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<User> findAllStudents(){
		//dtype column in database is a VarChar(string)
		return em.createQuery("FROM User WHERE dtype = :dtype", User.class).setParameter("dtype", "Student").getResultList();
	}
	
	public User findByUserName(String username) {
		return em.createQuery("FROM User WHERE username = :username", User.class).setParameter("username", username).getSingleResult();
	}
	
	public void createStudent(Student student) {
		em.persist(student);
	}
	
	public void createAdmin(Admin admin) {
		em.persist(admin);
	}
	
	public void deleteStudent(Long id) {
		Student student = em.getReference(Student.class, id);
		em.remove(student);
	}
	
	public void deleteAdmin(Long id) {
		Admin admin = em.getReference(Admin.class, id);
		em.remove(admin);
	}
	
	

}
