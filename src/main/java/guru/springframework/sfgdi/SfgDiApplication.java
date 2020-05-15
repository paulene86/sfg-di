package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.services.MyOtherService;
import guru.springframework.sfgdi.services.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);


		MyService myService = (MyService) ctx.getBean("myService");
		String bye = myService.saySomething();
		System.out.println(bye);

		MyOtherService myOtherService = (MyOtherService)ctx.getBean("myOtherService");
		myOtherService.saySomethingElse();


	}

}
