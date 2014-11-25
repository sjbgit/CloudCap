package org.magnum.mobilecloud.video.client;

import java.util.Collection;

import org.magnum.mobilecloud.video.repository.Credentials;
import org.magnum.mobilecloud.video.repository.PatientCheckIn;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface CheckInSvcApi {

	public static final String CHECKIN_SVC_PATH = "/checkin";
	
	@POST(CHECKIN_SVC_PATH)
	public boolean addCheckIn(@Body PatientCheckIn checkIn);
	
	@GET(CHECKIN_SVC_PATH + "/{id}")
	public Collection<PatientCheckIn> getCheckInsByPatientId(@Path("id") long id);
	
}
