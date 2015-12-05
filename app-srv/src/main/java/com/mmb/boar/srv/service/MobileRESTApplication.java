package com.mmb.boar.srv.service;

import com.mmb.boar.srv.util.CORSResponseFilter;
import com.mmb.boar.srv.util.LoggingResponseFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * Registers the components to be used by the JAX-RS application  
 * 
 * @author ama
 *
 */
public class MobileRESTApplication extends ResourceConfig {

    /**
	* Register JAX-RS application components.
	*/	
	public MobileRESTApplication(){
		register(RequestContextFilter.class);
		register(PodcastRestService.class);
		register(WebuserRestService.class);
		register(JacksonFeature.class);		
		register(LoggingResponseFilter.class);
		register(CORSResponseFilter.class);
	}
}
