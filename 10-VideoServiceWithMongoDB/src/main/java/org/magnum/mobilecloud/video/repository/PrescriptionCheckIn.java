package org.magnum.mobilecloud.video.repository;

public class PrescriptionCheckIn {
	
	public PrescriptionCheckIn() {
		
	}
	
	public long getCheckInDate() {

        return prescriptionCheckInDate;
    }


    public void setPrescriptionCheckInDate(long prescriptionCheckInDate) {
        this.prescriptionCheckInDate = prescriptionCheckInDate;
    }

    private long prescriptionCheckInDate;

    private String prescriptionName;

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    private String prescriptionDosage;

    public String getPrescriptionDosage() {
        return prescriptionDosage;
    }

    public void setPrescriptionDosage(String prescriptionDosage) {
        this.prescriptionDosage = prescriptionDosage;
    }

}
