package staff;

public class Dentist extends Staff {

	private String firstName;
	private String lastName;
	private String empno;
	private String specialist;
	public Dentist(String UserName, String Password,String firstName, String lastName, String specialist,String empno) {
		super(UserName, Password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.specialist =specialist;
		this.empno =empno;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmpno() {
		return empno;
	}

	public void setEmpno(String empno) {
		this.empno = empno;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassWord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dentist getAllDentist() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
