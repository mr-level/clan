package cn.level.restful;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.log4j.Logger;

public class Restful {
	
	public static final Logger log = Logger.getLogger(Restful.class);
	
	protected Response getResponse(int httpStatus) {
		return getResponse(httpStatus, null);
	}
	
	protected Response getResponse(int httpStatus, String body) {
		return getResponse(httpStatus, MediaType.APPLICATION_JSON, body);
	}
	
	protected Response getResponse(int httpStatus, String mediaType, String body) {
		
		log.info(body);
		
		ResponseBuilder builder = Response.status(httpStatus);
		builder.type(mediaType);
		builder.encoding("utf-8");
		builder.entity(body);
		
		return builder.build();
		
	}
}
