package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

	@Autowired
	private GreetingService greetingService;

	public String getGreting(){
		return greetingService.saySomething();
	}


}
