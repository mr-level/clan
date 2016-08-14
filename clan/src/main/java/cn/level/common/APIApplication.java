package cn.level.common;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class APIApplication extends ResourceConfig {
    public APIApplication() {
        //����Resource
        register(HelloResource.class);

        //ע������ת����
        register(JacksonJsonProvider.class);

        // Logging.
        register(LoggingFilter.class);
    }
}