package org.magnum.mobilecloud.video.repository;

import java.util.Collection;

public class Patient extends User {

	/*
	private long duration;
	
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	*/
	private Collection<Prescription> prescriptions;
	
	public Collection<Prescription> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Collection<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}
		
}
