package co.grandcircus.gcuCapstone.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Student extends User {
	
	private Long phone;
	private String adress;
	@OneToMany
	private List<Enrollments> enrollments;
	
	public Student(String username, String password, String firstName, String lastName, boolean isAdmin, Long phone, String adress) {
		super(username, password, firstName, lastName, isAdmin);
		this.phone = phone;
		this.adress = adress;
	}
	
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Student() {
		super();
	}
	public List<Enrollments> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(List<Enrollments> enrollments) {
		this.enrollments = enrollments;
	}
	
	
	
}
