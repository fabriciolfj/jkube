package com.github.fabriciolfj;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/api/v1/hello")
@Consumes("application/json")
@Produces("application/json")
public class HelloController {

    @GET
    public String getHello() {
        return "Hello";
    }
}