package co.grandcircus.gcuCapstone.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "course_id")
	private Long id;
	private String name;
	private String category;
	@OneToMany
	private List<Enrollments> list;
	
	public Course() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Enrollments> getList() {
		return list;
	}

	public void setList(List<Enrollments> list) {
		this.list = list;
	}
	
	
}
