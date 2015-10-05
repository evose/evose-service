/**
 * 
 */
package com.evose.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.jersey.api.client.ClientResponse.Status;

/**
 * @author vivekr
 *
 */
public class HelloWorldServiceTest {

	@Autowired
	HelloWorldService helloWorldService;
	/**
	 * Test method for {@link com.evose.service.HelloWorldService#sayHello()}.
	 */
	@Test
	public void testSayHello() {
		assert(helloWorldService.sayHello().getStatus()==200);
	}

}
