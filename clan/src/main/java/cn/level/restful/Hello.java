package cn.level.restful;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/")
public class Hello {
	
	@GET
	@Path("/clan/index")
	public void index(
			@Context HttpServletRequest request,
			@Context HttpServletResponse response
			) {
		
	}
}
