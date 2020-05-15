package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class MyOtherService {

	public void saySomethingElse(){
		System.out.println("yep from a service with @Component");
	}
}
