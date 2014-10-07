package org.magnum.mobilecloud.video.repository;

import java.util.ArrayList;
import java.util.Collection;

public class Doctor extends User {

	public Doctor() {
		patients = new ArrayList<Patient>();
	}
	
	private Collection<Patient> patients;
	
	public Collection<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Collection<Patient> patients) {
		this.patients = patients;
	}
}
