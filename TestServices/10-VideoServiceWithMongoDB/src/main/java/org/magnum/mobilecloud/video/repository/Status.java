package org.magnum.mobilecloud.video.repository;

import java.util.Date;

public class Status {

	private Date statusDate;

	public Date getStatusDate() {
		return statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}
	
	public boolean isReviewedByPhysician() {
		return reviewedByPhysician;
	}

	public void setReviewedByPhysician(boolean reviewedByPhysician) {
		this.reviewedByPhysician = reviewedByPhysician;
	}

	public PainLevel getPainLevel() {
		return painLevel;
	}

	public void setPainLevel(PainLevel painLevel) {
		this.painLevel = painLevel;
	}

	private boolean reviewedByPhysician;
	
	
	private PainLevel painLevel;
	
}
