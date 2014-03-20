package com.soda.gilbarco.sample;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/user")
public class SampleJAXRSService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
 
		String result = "Restful example : " + msg;
 
		return Response.status(200).entity(result).build();
 
	}
}