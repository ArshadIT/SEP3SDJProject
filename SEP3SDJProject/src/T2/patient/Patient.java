package T2.patient;

import java.io.Serializable;

public class Patient implements IPatient, Serializable{

	private String FirstName;
	private String LastName;
	private String CprNr;
	private String Email;
	private String Password;
	public Patient(String firstName, String lastName, String cprNr, String email, String password) {

		FirstName = firstName;
		LastName = lastName;
		CprNr = cprNr;
		Email = email;
		Password = password;
	}
	
	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getCprNr() {
		return CprNr;
	}

	public String getEmail() {
		return Email;
	}

	public String getPassword() {
		return Password;
	}

	@Override
	public String toString() {
		return "Patient [FirstName=" + FirstName + ", LastName=" + LastName + ", CprNr=" + CprNr + ", Email=" + Email
				+ ", Password=" + Password + "]";
	}
	@Override
	public Patient getAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Patient getPatient() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Patient getPatientByCprNr() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
