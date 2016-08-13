package cn.level.common;

import org.glassfish.jersey.server.ResourceConfig;

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