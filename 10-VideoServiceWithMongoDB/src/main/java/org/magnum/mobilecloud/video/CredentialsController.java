package org.magnum.mobilecloud.video;

import java.util.Collection;

import org.magnum.mobilecloud.video.client.CredentialsSvcApi;
import org.magnum.mobilecloud.video.repository.Credentials;
import org.magnum.mobilecloud.video.repository.CredentialsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CredentialsController {

	
	@Autowired
	private CredentialsRepository credentialsRepository;
	
	public CredentialsController() {
		
		Integer x = 1;
		Integer y = x;
	}
	
	@RequestMapping(value=CredentialsSvcApi.CREDENTIALS_SVC_PATH + "/{username}/{password}", method=RequestMethod.GET)
	public ResponseEntity<Credentials> getCredentials(@PathVariable("username") String username, @PathVariable("password") String password){	
		
		Collection<Credentials> creds = credentialsRepository.findAll();
		
		Credentials foundCred = null;
		
		for (Credentials cred : creds) {
			if (cred.getUserName().equalsIgnoreCase(username) && cred.getPassword().equalsIgnoreCase(password)) {
				return new ResponseEntity<Credentials>(cred, HttpStatus.OK);
			}
		}
		
				
		return new ResponseEntity<Credentials>(foundCred, HttpStatus.NOT_FOUND);
				
	}
	
}
