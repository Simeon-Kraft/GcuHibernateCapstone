package co.grandcircus.gcuCapstone.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuCapstone.entities.Enrollments;

@Repository
@Transactional
public class EnrollmentsDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Enrollments> findByStudentId(Long id){
		return em.createQuery("FROM Enrollments WHERE student = :student", Enrollments.class).setParameter("student", id).getResultList();
	}
	
	public List<Enrollments> findByCourseId(Long id){
		return em.createQuery("FROM Enrollments WHERE course = :course", Enrollments.class).setParameter("course", id).getResultList();
	}
}
