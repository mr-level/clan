package cn.level.restful;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import cn.level.common.JSONUtil;
import cn.level.define.HttpStatus;
import cn.level.entity.Clansman;
import cn.level.service.ClansmanService;

@Path("/")
public class ClansmanRestful extends Restful {

	@Autowired
	ClansmanService clansmanService;
	
	@POST
	@Path("/clan/clansman")
	public Response add(MultivaluedMap<String, String> fieldSet) {
		
		Response response = null;
		
		try {
		
			Clansman clansman = Clansman.newInstance(fieldSet);
			clansmanService.addClansman(clansman);
			
			response = getResponse(HttpStatus.OK);
			
		} catch (Exception e) {

			log.error(e.getMessage(),e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		
		return response;
		
	}
	
	@GET
	@Path("/clan/clansman/{id}")
	public Response findClansman(@PathParam("id") Integer id){
		
		Response response = null;
		
		try {
			
			Clansman clansman = new Clansman(id);
			Clansman resultMan = clansmanService.findClansmanById(clansman);
			
			String result = JSONUtil.beanToJson(resultMan);
			response = getResponse(HttpStatus.OK, result);
			
		} catch(Exception e){
			
			log.error(e.getMessage(),e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		
		return response;
		
	}
	
	@GET
	@Path("/clan/clansman/{id}/list")
	public Response findClansmanList(@PathParam("id") Integer id) {
		
		Response response = null;
		
		try {
			
			Clansman clansman = new Clansman(id);
			clansman.setId(id);
			
			List<Clansman> clansmanList = clansmanService.findClansmanListById(clansman);
			String result = JSONUtil.beanToJson(clansmanList);
			
			response = getResponse(HttpStatus.OK, result);
			
		} catch(Exception e) {
			
			log.error(e.getMessage(), e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		
		return response;
		
	}
	
	@GET
	@Path("/clan/clansman/{id}/elder-list")
	public Response findEldersByOrderNum(@PathParam("id") Integer id) {
		
		Response response = null;
		
		try {
			
			Clansman clansman = new Clansman(id);
			clansman.setId(id);
			
			List<Clansman> clansmanList = clansmanService.findEldersByOrderNum(clansman);
			String result = JSONUtil.beanToJson(clansmanList);
			
			response = getResponse(HttpStatus.OK, result);
			
		} catch(Exception e) {
			
			log.error(e.getMessage(), e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		
		return response;
		
	}
	
	@PUT
	@Path("/clan/clansman/{id}")
	public Response updateInfoById(MultivaluedMap<String, String> fieldSet) {
		
		Response response = null;
		
		try {
			
			Clansman clansman = Clansman.newInstance(fieldSet);
			clansmanService.updateInfoById(clansman);
			
			response = getResponse(HttpStatus.OK);
			
		} catch(Exception e) {
			
			log.error(e.getMessage(), e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		
		return response;
		
	}
	
	@DELETE
	@Path("/clan/clansman/{id}")
	public Response removeClansman(@PathParam("id") Integer id) {
		
		Response response = null;
		
		try {
			
			Clansman clansman = new Clansman(id);
			clansmanService.removeClansman(clansman);
			
			response = getResponse(HttpStatus.OK);
			
		} catch (Exception e) {
			
			log.error(e.getMessage(), e);
			response = getResponse(HttpStatus.INTERNAL_ERROR);
			
		}
		
		return response;
		
	}
	
}
