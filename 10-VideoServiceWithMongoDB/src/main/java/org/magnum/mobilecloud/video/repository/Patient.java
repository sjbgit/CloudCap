package org.magnum.mobilecloud.video.repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class Patient extends User {

	public Patient() {
		prescriptions = new ArrayList<Prescription>();
		statuses = new ArrayList<Status>();
	}
	
	/*
	private long duration;
	
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	*/
	
	private String medicalRecordNumber;
	
	private Collection<Prescription> prescriptions;
	
	public Collection<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Collection<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}
	
	public Collection<Status> getStatuses() {
		return statuses;
	}

	public void setStatuses(Collection<Status> statuses) {
		this.statuses = statuses;
	}

	public String getMedicalRecordNumber() {
		return medicalRecordNumber;
	}

	public void setMedicalRecordNumber(String medicalRecordNumber) {
		this.medicalRecordNumber = medicalRecordNumber;
	}

	private Collection<Status> statuses;
	
		
}
