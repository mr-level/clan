package cn.level.common;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {
	
	private static final Logger log = Logger.getLogger(JSONUtil.class);
	
	public static Object jsonToBean(String json, Class<?> clazz) {
		
		if (json == null) {
			return null;
		}
		
		Object obj = null;
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			mapper.setSerializationInclusion(Include.NON_NULL);
			
			obj = mapper.readValue(json, clazz);
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		
		return obj;
		
	}
	
	public static String beanToJson(Object obj) {
		
		String json = null;
		
		try {
			
			ObjectMapper mapper = new ObjectMapper();
			json = mapper.writeValueAsString(obj);
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		
		return json;
		
	}

}
