package ba.unsa.etf.si.beans;

public class User implements java.io.Serializable {
	
	long user_id;

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
	
	public User() {}
	

}
