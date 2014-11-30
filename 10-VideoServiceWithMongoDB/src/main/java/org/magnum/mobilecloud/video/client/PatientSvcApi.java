package org.magnum.mobilecloud.video.client;

import java.util.Collection;
import java.util.List;

import org.magnum.mobilecloud.video.repository.Patient;
import org.magnum.mobilecloud.video.repository.PatientCheckIn;
import org.magnum.mobilecloud.video.repository.Physician;
import org.magnum.mobilecloud.video.repository.Prescription;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface PatientSvcApi {
	
	
	public static final String PATIENT_SVC_PATH = "/patients";
	public static final String ID_PARAMETER = "id";
	
	
	@GET(PATIENT_SVC_PATH + "/forphysician/{id}")
	public Collection<Patient> getPatientsByPhysicianId(@Path(ID_PARAMETER) String id);
	
	
	@POST(PATIENT_SVC_PATH + "/patientprescription/{id}")
	public Patient updatePatientPrescriptions(@Path(ID_PARAMETER) String id, @Body List<Prescription> prescriptions);

}
