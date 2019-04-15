package staff;

public abstract class Staff implements IStaff {
	
	
	private String UserName;
	private String Password;

	public Staff(String UserName, String Password) {
		
		this.UserName = UserName;
		this.Password = Password;
	}
}
