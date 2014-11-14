package org.magnum.mobilecloud.video;

import java.util.Collection;

import org.magnum.mobilecloud.video.repository.Video;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Lists;

import java.io.IOException;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;



	@Controller
	public class VideoUploadController {
		
		public static final String DATA_PARAMETER = "data";

		public static final String ID_PARAMETER = "id";

		public static final String VIDEO_SVC_PATH = "/testvideo";
		
		public static final String VIDEO_DATA_PATH = VIDEO_SVC_PATH + "/{id}/data";
		
		//private Map videos = new HashMap();
		
		//private VideoFileManager videoDataMgr;
		
		public VideoUploadController() {
			// TODO Auto-generated constructor stub
			int x = 1;
			
			int y = x;
			//videoDataMgr = VideoFileManager.get();
		}
		
	
		@RequestMapping(value=VIDEO_SVC_PATH + "test", method=RequestMethod.GET)
	    public @ResponseBody Collection<String> getVideoList() {
			//videos.put(1, 1000);
			
			
			int x = 1;
			int y = 2;
			
			return Lists.newArrayList();
		}
		
		
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
		
		

	}
	
	

