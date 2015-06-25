/**
 * 
 */
package modelo.dominio;

/**
 * @author Jaime Gpetis
 *
 * 
 */
public class Users {
	/**
	 * 
	 */
	private String user_name;
	private String user_pass;
	public Users() {
		
	}
	/**
	 * @return the user_name
	 */
	public String getUser_name() {
		return user_name;
	}
	/**
	 * @param user_name the user_name to set
	 */
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	/**
	 * @return the user_pass
	 */
	public String getUser_pass() {
		return user_pass;
	}
	/**
	 * @param user_pass the user_pass to set
	 */
	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}
	public  String toString() {
		return user_name + user_pass;
		
	}

}
