package vislabExample.model.db;

// Generated 14.05.2011 13:03:40 by Hibernate Tools 3.4.0.CR1

/**
 * Admin generated by hbm2java
 */
public class Admin implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2142996981668164628L;
	private String username;
	private String password;

	public Admin() {
	}

	public Admin(String username) {
		this.username = username;
	}

	public Admin(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
