package org.magnum.mobilecloud.video.client;



import org.magnum.mobilecloud.video.repository.Credentials;



import retrofit.http.GET;
import retrofit.http.Path;

public interface CredentialsSvcApi {
	
	public static final String CREDENTIALS_SVC_PATH = "/credentials";
	
	public static final String USERNAME_PARAMETER = "username";
	public static final String PASSWORD_PARAMETER = "password";
	
	
	@GET(CREDENTIALS_SVC_PATH + "/{username}/{password}")
	public Credentials getCredentials(@Path(USERNAME_PARAMETER) String userName, @Path(PASSWORD_PARAMETER) String password);

}
