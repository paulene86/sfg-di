package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("I18nControlleir------------------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------------------PropertyInjectionController");
		PropertyInjectionController propertyInjectionController =
			(PropertyInjectionController)ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getGreting());


		System.out.println("---------------------SetterInjectionController");
		SetterInjectionController setterInjectionController =
			(SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreetings());

		System.out.println("---------------------ConstructorInjectionController");
		ConstructorInjectionController constructorInjectionController =
			(ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorInjectionController.getGreetings());




	}

}
