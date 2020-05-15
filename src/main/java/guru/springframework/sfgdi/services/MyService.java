package guru.springframework.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class MyService {

	public String saySomething(){
		System.out.println("Hi from Service with @Service");
		return "bye there";
	}




}
