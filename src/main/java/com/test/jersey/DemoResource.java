package com.test.jersey;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//
// Pingable at:
// http://localhost:8080/api/demo/ping
//
@Path("/demo")
public class DemoResource {

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
    }

    @GET
    @Path("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification(@PathParam("id") int id) {
        return Response.ok()
                .entity(new DemoPojo(id, "test message"))
                .build();
    }

    @POST
    @Path("/post/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(DemoPojo notification) {
        return Response.status(201).entity(notification).build();
    }
}