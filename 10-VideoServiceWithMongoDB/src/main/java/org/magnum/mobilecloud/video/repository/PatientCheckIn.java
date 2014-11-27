package org.magnum.mobilecloud.video.repository;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class PatientCheckIn {

	@Id
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	public long getCheckInDate() {

        return checkInDate;
    }

    private long checkInDate;

    public PatientCheckIn() {
        this.checkInDate = System.currentTimeMillis();
        this.prescriptionCheckIns = new ArrayList<PrescriptionCheckIn>();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPhysicianId() {
        return physicianId;
    }

    public void setPhysicianId(String physicianId) {
        this.physicianId = physicianId;
    }

    private String patientId;

    private String physicianId;

    private String mouthPain;

    public String getMouthPain() {
        return mouthPain;
    }

    public void setMouthPain(String mouthPain) {
        this.mouthPain = mouthPain;
    }

    private String foodConsumption;

    public String getFoodConsumption() {
        return foodConsumption;
    }

    public void setFoodConsumption(String foodConsumption) {
        this.foodConsumption = foodConsumption;
    }

    
    /*
    
    public PrescriptionCheckIn[] getPrescriptionCheckIns() {
        return prescriptionCheckIns;
    }

    public void setPrescriptionCheckIns(PrescriptionCheckIn[] prescriptionCheckIns) {
        this.prescriptionCheckIns = prescriptionCheckIns;
    }

    private PrescriptionCheckIn[] prescriptionCheckIns;
    */
    
    
    
    public List<PrescriptionCheckIn> getPrescriptionCheckIns() {
        return prescriptionCheckIns;
    }

    public void setPrescriptionCheckIns(List<PrescriptionCheckIn> prescriptionCheckIns) {
        this.prescriptionCheckIns = prescriptionCheckIns;
    }

    private List<PrescriptionCheckIn> prescriptionCheckIns;
	
	
	
	
    //private

    //http://www.tutorialspoint.com/java/java_date_time.htm
    //get current date
    //Date date = new Date()

	/*
    public Date getCheckInDate() {
        return checkInDate;
    }

    private Date checkInDate;

    public PatientCheckIn() {
    	this.checkInDate = new Date();
    }
    */
    //public CheckInMini(Patient patient) {
    //    this.patient = patient;
    //    this.checkInDate = new Date();
    //}

    //public Patient getPatient() {
    //    return patient;
    //}
	
}
