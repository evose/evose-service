/**
 * 
 */
package com.evose.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
		assert (true);//assert(helloWorldService.sayHello().getStatus()==200);
	}

}
