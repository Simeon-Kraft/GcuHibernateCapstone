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
@Table(name = "students")
public class Student extends User {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "student_id")
	private Long id;
	private boolean isAdmin = false;
	private String LastName;
	private Long phone;
	private String adress;
	@OneToMany
	private List<Enrollments> enrollments;
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", LastName=" + LastName + ", phone=" + phone
				+ ", adress=" + adress + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
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
	public Student(Long id, String firstName, String lastName, Long phone, String adress) {
		super();
		this.id = id;
		this.firstName = firstName;
		LastName = lastName;
		this.phone = phone;
		this.adress = adress;
	}
	public Student() {
		super();
	}
	private String firstName;
	public List<Enrollments> getEnrollments() {
		return enrollments;
	}
	public void setEnrollments(List<Enrollments> enrollments) {
		this.enrollments = enrollments;
	}
	
	
	
}
