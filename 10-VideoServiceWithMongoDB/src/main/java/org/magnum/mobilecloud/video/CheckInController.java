package org.magnum.mobilecloud.video;

import java.util.ArrayList;
import java.util.Collection;

import org.magnum.mobilecloud.video.client.CheckInSvcApi;
import org.magnum.mobilecloud.video.client.PhysicianSvcApi;
import org.magnum.mobilecloud.video.repository.CheckIn;
import org.magnum.mobilecloud.video.repository.PatientCheckIn;
import org.magnum.mobilecloud.video.repository.Physician;
import org.magnum.mobilecloud.video.repository.PrescriptionCheckIn;
import org.magnum.mobilecloud.video.repository.PrescriptionCheckInViewModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckInController {

	
	@RequestMapping(value=CheckInSvcApi.CHECKIN_SVC_PATH, method=RequestMethod.POST)
	public @ResponseBody boolean addCheckIn(@RequestBody PatientCheckIn checkIn){		 
		 
		return true;
		
		//videos.save(v);
		 //return v;
		 //return true;
	}
	
	
	@RequestMapping(value=CheckInSvcApi.CHECKIN_SVC_PATH + "/{id}", method=RequestMethod.GET)
	public ResponseEntity<Collection<PatientCheckIn>> getCheckInsByPatientId(@PathVariable("id") long id){	
		
		
		Collection<PatientCheckIn> checkIns = new ArrayList<PatientCheckIn>();
		
		PatientCheckIn pci = new PatientCheckIn();
		pci.setFoodConsumption("food");
		pci.setMouthPain("mouthPain");
		
		PrescriptionCheckIn prci = new PrescriptionCheckIn();
		prci.setPrescriptionName("prescriptionName");
		prci.setPrescriptionDosage("test dosage");
		
		
		Collection<PrescriptionCheckIn> scriptCheckIns = new ArrayList<PrescriptionCheckIn>();
		scriptCheckIns.add(prci);
		
		
		
		pci.setPrescriptionCheckIns(scriptCheckIns); //.toArray(new PrescriptionCheckIn[scriptCheckIns.size()]));
		
		checkIns.add(pci);
		
		
		//return checkIns;
		//PatientCheckIn[] checks = (PatientCheckIn[])checkIns.toArray();
		
		//PatientCheckIn[] checks = (PatientCheckIn[])(checkIns.toArray(new PatientCheckIn[checkIns.size()]));
		
		return new ResponseEntity<Collection<PatientCheckIn>>(checkIns, HttpStatus.OK);
	
			//CredentialsSvcApi api;
		
		//Physician phys = new Physician();
		//phys.setId(98765);
		
		
		
		//return new ResponseEntity<Physician>(phys, HttpStatus.OK);
		
		
		 //videos.save(v);
		 //return v;
		 //return true;
	}
	
	
}
