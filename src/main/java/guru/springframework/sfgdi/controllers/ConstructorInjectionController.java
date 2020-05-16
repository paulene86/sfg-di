package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class  ConstructorInjectionController {

	private GreetingService greetingService;

	public ConstructorInjectionController(GreetingService greetingService){
		this.greetingService = greetingService;
	}

	public String getGreetings(){
		return "hey from constructorInjectionController";
	}




}
