package cn.level.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/")
public class Hello {
	
	@GET
	@Path("/index")
	@Produces(MediaType.TEXT_HTML)
	public Viewable index() {
			 Viewable viewable = new Viewable("/index", null);
		return viewable;   
	}
}
