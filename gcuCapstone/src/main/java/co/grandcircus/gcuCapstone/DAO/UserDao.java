package co.grandcircus.gcuCapstone.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuCapstone.entities.Admin;
import co.grandcircus.gcuCapstone.entities.Student;

@Repository
@Transactional
public class UserDao {
	
	@PersistenceContext
	private EntityManager em;
	
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
