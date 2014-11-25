package org.magnum.mobilecloud.video;

import org.magnum.mobilecloud.video.client.PhysicianSvcApi;
import org.magnum.mobilecloud.video.repository.Physician;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PhysicianController {

	public PhysicianController() {
		
		Integer x = 1;
		Integer y = x;
	}
	
	@RequestMapping(value=PhysicianSvcApi.PHYSICIAN_SVC_PATH + "/{id}", method=RequestMethod.GET)
	public ResponseEntity<Physician> getPhysician(@PathVariable("id") long id){	
		
	
			//CredentialsSvcApi api;
		
		Physician phys = new Physician();
		phys.setId(98765);
		
		
		
		return new ResponseEntity<Physician>(phys, HttpStatus.OK);
		
		
		 //videos.save(v);
		 //return v;
		 //return true;
	}
}
