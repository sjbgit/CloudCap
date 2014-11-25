package org.magnum.mobilecloud.video.repository;

public class Prescription {
	public Prescription() {}
	public Prescription(String name, String dosage){
        this.name = name;
        this.dosage = dosage;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    private String dosage;
	
	/*
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	private int dosage;
	
	*/
}
