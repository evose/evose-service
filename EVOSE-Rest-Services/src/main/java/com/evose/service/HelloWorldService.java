package com.evose.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evose.statics.StaticMessageService;

@Component
@Path("/evose")
public class HelloWorldService {

	@Autowired
	StaticMessageService staticMessageService;
	
	
	@GET
	@Path("/say_hello")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response sayHello(){
		return Response.ok(new String(staticMessageService.returnMessage())).build();
	}
}
