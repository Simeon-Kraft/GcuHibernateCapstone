package co.grandcircus.gcuCapstone.entities;

public class Admin extends User {
	
	private boolean isAdmin = true;
	
	public Admin() {}
	
	public Admin(boolean isAdmin) {
		super();
		this.isAdmin = true;
	}
}
