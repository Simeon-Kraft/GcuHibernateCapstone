package co.grandcircus.gcuCapstone.entities;

public class Admin extends User {
	
	private boolean isAdmin = true;
	
	public Admin() {}
	
	public Admin(String username, String password, String firstName, String lastName, boolean isAdmin) {
		super(username, password, firstName, lastName, isAdmin);
		this.isAdmin = isAdmin;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
}
