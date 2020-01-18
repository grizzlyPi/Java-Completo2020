package entities;

public class RegisterForm {
	private String name;
	private String email;
	
	public RegisterForm(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public String getMail() {
		return email;
	}
	
	public void setMail(String email) {
		this.email = email;
	}
	
}
