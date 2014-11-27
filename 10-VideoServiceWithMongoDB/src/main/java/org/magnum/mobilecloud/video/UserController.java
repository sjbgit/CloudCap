package org.magnum.mobilecloud.video;

import java.util.Collection;

import org.magnum.mobilecloud.video.repository.User;
import org.magnum.mobilecloud.video.repository.Video;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

@Controller
public class UserController {
	
	public static final String DATA_PARAMETER = "data";

	public static final String ID_PARAMETER = "id";

	public static final String USER_SVC_PATH = "/users";
	
	public static final String VIDEO_DATA_PATH = USER_SVC_PATH + "/{id}/data";
	
	//private Map videos = new HashMap();
	
	//private VideoFileManager videoDataMgr;
	
	public UserController() {
		// TODO Auto-generated constructor stub
		int x = 1;
		
		int y = x;
		//videoDataMgr = VideoFileManager.get();
	}
	

	@RequestMapping(value=USER_SVC_PATH, method=RequestMethod.GET)
    public @ResponseBody Collection<User> getUserList() {
		//videos.put(1, 1000);
		
		
		User v = new User();
		//v.setDuration(1000);
		//v.setId("");
		v.setFirstName("test name");
		v.setPassword("my password");
		//v.setUrl("test url");
		
		int x = 1;
		int y = 2;
		
		return Lists.newArrayList(v);
	}
	
	/*
	@RequestMapping(value="getvids", method=RequestMethod.GET)
    public @ResponseBody Video getVideo() {
		//videos.put(1, 1000);
		
		Video v = new Video();
		v.setDuration(1000);
		v.setId(99);
		v.setName("test name");
		v.setUrl("test url");
		
		
		int x = 1;
		int y = 2;
		
		return v;
		//return Lists.newArrayList();
	}
	*/
	

}