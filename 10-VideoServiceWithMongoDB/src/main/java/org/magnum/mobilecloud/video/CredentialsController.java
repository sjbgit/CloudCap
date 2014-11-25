package org.magnum.mobilecloud.video;

import org.magnum.mobilecloud.video.client.CredentialsSvcApi;
import org.magnum.mobilecloud.video.repository.Credentials;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CredentialsController {

	
	public CredentialsController() {
		
		Integer x = 1;
		Integer y = x;
	}
	
	@RequestMapping(value=CredentialsSvcApi.CREDENTIALS_SVC_PATH + "/{username}/{password}", method=RequestMethod.GET)
	public ResponseEntity<Credentials> getCredentials(@PathVariable("username") String username, @PathVariable("password") String password){	
		
	
			//CredentialsSvcApi api;
		
		Credentials creds = new Credentials();
		creds.setId("test id");
		creds.setType("test type");
		
		
		return new ResponseEntity<Credentials>(creds, HttpStatus.OK);
		
		
		 //videos.save(v);
		 //return v;
		 //return true;
	}
	
}
