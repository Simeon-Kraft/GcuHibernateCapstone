package co.grandcircus.gcuCapstone.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class User {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private boolean isAdmin;
	
	public User() {}
	
	public User(String username, String password, String firstName, String lastName, boolean isAdmin) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.isAdmin = isAdmin;
	}
}
