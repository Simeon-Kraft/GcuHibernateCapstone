package co.grandcircus.gcuCapstone.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuCapstone.entities.Enrollments;
import co.grandcircus.gcuCapstone.entities.Student;
import co.grandcircus.gcuCapstone.entities.User;

@Repository
@Transactional
public class EnrollmentsDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Enrollments> findByStudent(Student student){
		return em.createQuery("FROM Enrollments WHERE student = :student", Enrollments.class).setParameter("student", student).getResultList();
	}
	
	public List<Enrollments> findByCourseId(Long id){
		return em.createQuery("FROM Enrollments WHERE course = :course", Enrollments.class).setParameter("course", id).getResultList();
	}
}
