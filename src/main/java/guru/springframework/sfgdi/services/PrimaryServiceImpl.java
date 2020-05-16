package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryServiceImpl implements GreetingService {

	@Override
	public String saySomething() {

		return "Hi from the PrimaryService";
	}
}
