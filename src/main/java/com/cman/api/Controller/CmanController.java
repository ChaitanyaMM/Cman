package com.cman.api.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cman/api")
public class CmanController {

	@RequestMapping(value = "/s1", method = RequestMethod.GET)
	public String cmanMethod() {
		return "Hello cman is up!";

	}

}
