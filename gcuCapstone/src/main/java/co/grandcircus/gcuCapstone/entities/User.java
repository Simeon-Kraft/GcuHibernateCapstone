package co.grandcircus.gcuCapstone.entities;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class User {
	
	private Long id;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private boolean isAdmin;
	

}
