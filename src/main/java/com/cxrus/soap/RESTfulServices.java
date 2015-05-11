package com.cxrus.soap;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/restfulservice")
public class RESTfulServices {
	
	
	@GET
	@Path("/product/{productID}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getSummary(@PathParam("productID") String productID){

		return null;
	}
	
}
