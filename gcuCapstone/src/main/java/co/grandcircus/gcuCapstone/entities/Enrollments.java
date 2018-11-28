package co.grandcircus.gcuCapstone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "enrollments")
public class Enrollments {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Student student;
	@ManyToOne
	private Course course;
	private Double grade;
	private String semester;
	
	public Enrollments() {}

}
