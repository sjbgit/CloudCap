package org.magnum.mobilecloud.video.repository;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class CheckIn {

	@Id
	private long id;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
    //private

    //http://www.tutorialspoint.com/java/java_date_time.htm
    //get current date
    //Date date = new Date()

    public Date getCheckInDate() {
        return checkInDate;
    }

    private Date checkInDate;

    public CheckIn(Patient patient) {
        this.patient = patient;
        this.checkInDate = new Date();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    private Patient patient;

    private String mouthPain;

    private String foodConsumption;

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getMouthPain() {
        return mouthPain;
    }

    public void setMouthPain(String mouthPain) {
        this.mouthPain = mouthPain;
    }

    public String getFoodConsumption() {
        return foodConsumption;
    }

    public void setFoodConsumption(String foodConsumption) {
        this.foodConsumption = foodConsumption;
    }




    public Collection<PrescriptionCheckInViewModel> getPrescriptionCheckInViewModelCollection() {
        return prescriptionCheckInViewModelCollection;
    }

    public void setPrescriptionCheckInViewModelCollection(Collection<PrescriptionCheckInViewModel> prescriptionCheckInViewModelCollection) {
        this.prescriptionCheckInViewModelCollection = prescriptionCheckInViewModelCollection;
    }

    private Collection<PrescriptionCheckInViewModel> prescriptionCheckInViewModelCollection;

}

