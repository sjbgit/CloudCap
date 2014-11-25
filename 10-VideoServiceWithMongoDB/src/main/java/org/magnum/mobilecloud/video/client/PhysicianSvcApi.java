package org.magnum.mobilecloud.video.client;

import org.magnum.mobilecloud.video.repository.Credentials;
import org.magnum.mobilecloud.video.repository.Physician;

import retrofit.http.GET;
import retrofit.http.Path;

public interface PhysicianSvcApi {
	
public static final String PHYSICIAN_SVC_PATH = "/physician";
	
	public static final String ID_PARAMETER = "id";
		
	//http://localhost:8080/video/search/findByName?title=xxx
	@GET(PHYSICIAN_SVC_PATH + "/{id}")
	public Physician getPhysician(@Path(ID_PARAMETER) long id);

	

}
