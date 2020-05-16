package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterServiceImpl implements GreetingService {
	@Override
	public String saySomething() {
		return "Hey Hello Mundo - Setter";
	}
}
