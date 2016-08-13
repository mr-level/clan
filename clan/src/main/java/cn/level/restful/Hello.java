package cn.level.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/")
public class Hello {
	
	@GET
	@Path("/clan/index")
	public Viewable index() {
		return new Viewable("/pages/index.html", null);   
	}
}
