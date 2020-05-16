package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
	@Override
	public String saySomething() {
		return "Hey Hello Mundo";
	}
}
