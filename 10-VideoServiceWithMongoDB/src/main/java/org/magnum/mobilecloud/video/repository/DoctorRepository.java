package org.magnum.mobilecloud.video.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource(path = "/doctors")
public interface DoctorRepository extends MongoRepository<Doctor, Long>{
	

}