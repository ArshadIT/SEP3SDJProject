package T2.Logic.PatientController;

import java.sql.SQLException;
import java.util.ArrayList;

import T2.patient.Patient;
import T3.DataLayer.DAO.PatientHandler;

public class PatientControllerImp implements IPatientController{

	private ArrayList<Patient>patientlist = new ArrayList<Patient>();
	private PatientHandler patientH;
	
	@Override
	public ArrayList<Patient> getAllPatient() throws SQLException {
         
		return patientH.getAllPatient();
	}

	
	@Override
	public Patient getPatientByCprNo(String CprNumber) {
		for(int i = 0; i <patientlist.size(); i++) {
			if(patientlist.get(i).getCprNo().equals(CprNumber)) {
				Patient pat = (Patient)patientlist.get(i);
		
				return pat;
	}
			} return null;

}


	@Override
	public Patient addPatient(Patient patient) {
	   patientlist.add(patient);
		return null;
	}


	@Override
	public void removePatient(Patient patient) {
		patientlist.remove(patient);
		
	}


	@Override
	public Patient editPatient(Patient patient) {
		for(int i =0; i< patientlist.size(); i++) {
			if(patientlist.get(i).getCprNo().equals(patient.getCprNo())) {
				Patient pat1= (Patient)patientlist.get(i);
			}
		}
		return null;
	}
	}
