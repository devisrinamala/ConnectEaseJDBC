package models;

public class student {
	
	private String pinnumber;
	private String name;
	private String email;
	private String branch;
	
	public String getPinnumber() {
		return pinnumber;
	}
	public void setPinnumber(String pinnumber) {
		this.pinnumber = pinnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
	public student() {
		super();
	}
	public student(String pinnumber, String name, String email, String branch) {
		super();
		this.pinnumber = pinnumber;
		this.name = name;
		this.email = email;
		this.branch = branch;
	}
	
	
	
	
	
}
