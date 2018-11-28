package co.grandcircus.gcuCapstone.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.gcuCapstone.entities.Course;

@Repository
@Transactional
public class CourseDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Course> findAll(){
		return em.createQuery("FROM Course", Course.class).getResultList();
	}
	
	public void createCourse(Course course) {
		em.persist(course);
	}
	
	public void deleteCourse(Long id) {
		Course course = em.getReference(Course.class, id);
		em.remove(course);
	}
	
	public List<Course> findByName(String name){
		return em.createQuery("FROM Course WHERE name = :name", Course.class).setParameter("name", name).getResultList();
	}
	
	public List<Course> findByCat(String category){
		//full-time || part-time
		return em.createQuery("FROM Course WHERE category = :category", Course.class).setParameter("category", category).getResultList();
	}
}
