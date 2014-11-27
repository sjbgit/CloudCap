package org.magnum.mobilecloud.video;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.magnum.mobilecloud.video.client.CheckInSvcApi;
import org.magnum.mobilecloud.video.repository.PainLevel;
import org.magnum.mobilecloud.video.repository.Patient;
import org.magnum.mobilecloud.video.repository.PatientCheckIn;
import org.magnum.mobilecloud.video.repository.PatientRepository;
import org.magnum.mobilecloud.video.repository.Prescription;
import org.magnum.mobilecloud.video.repository.Status;
import org.magnum.mobilecloud.video.repository.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;


@Controller
public class PatientController {
	//public static final String DATA_PARAMETER = "data";

	//public static final String ID_PARAMETER = "id";

	public static final String PATIENT_SVC_PATH = "/patients";
	
	//public static final String VIDEO_DATA_PATH = PATIENT_SVC_PATH + "/{id}/data";
	
	//private Map videos = new HashMap();
	
	//private VideoFileManager videoDataMgr;
	
	@Autowired
	private PatientRepository patientRepo;
	
	public PatientController() {
		// TODO Auto-generated constructor stub
		int x = 1;
		
		int y = x;
		//videoDataMgr = VideoFileManager.get();
	}
	
	@RequestMapping(value=PATIENT_SVC_PATH + "/{id}", method=RequestMethod.GET)
	public ResponseEntity<Patient> getPatientById(@PathVariable("id") String id){
		
		Patient patient = patientRepo.findOne(id);
			
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}
	
	@RequestMapping(value=PATIENT_SVC_PATH + "/forphysician/{id}", method=RequestMethod.GET)
    public @ResponseBody ResponseEntity<Collection<Patient>> getPatientsByPhysicianId(@PathVariable("id") String id) {
		
		Collection<Patient> patients = patientRepo.findAll();
		
		List<Patient> filteredPatients = new ArrayList<Patient>();
		for (Patient p : patients) {
			String pid = p.getPhysicianId();
			if (pid.equals(id)) {
				filteredPatients.add(p);
			}
		}
		
		return new ResponseEntity<Collection<Patient>>(filteredPatients, HttpStatus.OK);		
		
	}
	

	@RequestMapping(value=PATIENT_SVC_PATH + "/all", method=RequestMethod.GET)
    public @ResponseBody Collection<Patient> getPatientList() {
		//videos.put(1, 1000);
		
		Patient p = new Patient();
		p.setFirstName("test patient UPDATED IN SVC 1");
		p.setPassword("test patient 1 password");
		
		Prescription prescript = new Prescription();
		prescript.setName("Oxyctin");
		prescript.setDosage("900");
		
		Prescription prescript1 = new Prescription();
		prescript1.setName("Lamasil");
		prescript1.setDosage("2000");
		
		p.getPrescriptions().add(prescript);
		p.getPrescriptions().add(prescript1);
		
		Status s = new Status();
		s.setPainLevel(PainLevel.Moderate);
		s.setStatusDate(new Date());
		
		p.getStatuses().add(s);
		
		
		
		
		patientRepo.save(p);
		
		
		
		List<Patient> all = patientRepo.findAll();
		
		Patient zero = patientRepo.findOne(p.getId());
		
		Status s1 = new Status();
		s1.setPainLevel(PainLevel.Severe);
		s1.setStatusDate(new Date());
		
		zero.getStatuses().add(s1);
		
		patientRepo.save(zero);
		
		/*
		User v = new User();
		//v.setDuration(1000);
		v.setId(99);
		v.setName("test name");
		v.setPassword("my password");
		//v.setUrl("test url");
		*/
		int x = 1;
		int y = 2;
		
		return Lists.newArrayList(p);
	}
}
