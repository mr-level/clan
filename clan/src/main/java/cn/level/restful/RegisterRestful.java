package cn.level.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;

import cn.level.define.HttpStatus;
import cn.level.entity.User;
import cn.level.service.UserService;

@Path("/")
public class RegisterRestful extends Restful{

	@Autowired
	UserService userService;
	
	private static final Logger log = Logger.getLogger(RegisterRestful.class);
	
	@GET
	@Path("/v1/user/registration")
	public Response register() {
		
		Response response = null;
		try {
			
			User user = new User();
			user.setUserName("ÀîËÄ");
			System.out.println("[[[[[[[[[[[[");
			System.out.println(userService.getClass().getSimpleName());
			userService.add(user);
			System.out.println("[[[[[[[[[[[[");
			response = getResponse(HttpStatus.OK);
		}catch(Throwable e) {
			
			log.error(e.getMessage(), e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		return response;
	}
}
