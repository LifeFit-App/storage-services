package com.lifefit.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("lifefit-ss")
public class MyApplicationConfig extends ResourceConfig {
    public MyApplicationConfig () {
        packages("com.lifefit.rest");
    }
}
