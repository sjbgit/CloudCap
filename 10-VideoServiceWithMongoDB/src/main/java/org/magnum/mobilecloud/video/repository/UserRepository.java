package org.magnum.mobilecloud.video.repository;


import org.magnum.mobilecloud.video.client.VideoSvcApi;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "/user")
public interface UserRepository extends MongoRepository<User, Long>{
	

}

