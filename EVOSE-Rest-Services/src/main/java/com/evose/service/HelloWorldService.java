package com.evose.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.evose.statics.StaticMessageService;

@Component
@Path("/say_hello")
public class HelloWorldService {

	@Autowired
	StaticMessageService staticMessageService;

	@GET
	public Response sayHello() {
		return Response.ok(new String(staticMessageService.returnMessage()))
				.build();
	}
}
