package org.olive;

import java.util.List;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

import org.olive.Entities.*;


@Path("api/episodes")
public class HelloResource {

    @ConfigProperty(name = "version")
    String version;

    @GET
    public List<episode> hello() {
        return episode.listAll();
    }

    
} 
