package co.grandcircus.gcuCapstone.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "course_id")
	private Long id;
	private String name;
	private String category;
	private List<Enrollments> list;
	
	public Course() {}

}
