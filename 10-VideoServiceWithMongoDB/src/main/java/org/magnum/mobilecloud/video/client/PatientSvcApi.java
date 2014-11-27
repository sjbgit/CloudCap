package org.magnum.mobilecloud.video.client;

import java.util.Collection;

import org.magnum.mobilecloud.video.repository.Patient;
import org.magnum.mobilecloud.video.repository.PatientCheckIn;
import org.magnum.mobilecloud.video.repository.Physician;

import retrofit.http.GET;
import retrofit.http.Path;

public interface PatientSvcApi {
	
	
	public static final String PATIENT_SVC_PATH = "/patients";
	public static final String ID_PARAMETER = "id";
	
	
	//@GET(PATIENT_SVC_PATH + "/{id}")
	//public Collection<Patient> getPatients(@Path("id") String id);
	
	@GET(PATIENT_SVC_PATH + "/forphysician/{id}")
	public Collection<Patient> getPatientsByPhysicianId(@Path(ID_PARAMETER) String id);

}
