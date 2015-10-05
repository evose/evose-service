package com.evose.statics;

import org.springframework.stereotype.Component;

import com.evose.commons.constants.EvoseCommonMessages;

@Component
public class StaticMessageService {

	public String returnMessage(){
		return EvoseCommonMessages.HELLO_WORLD;
	}
}
