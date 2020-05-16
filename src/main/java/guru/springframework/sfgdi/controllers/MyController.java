package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MyController {

    @Autowired
    private  GreetingService greetingService;

    public String sayHello(){
        System.out.println("Hello World from MyController!!!");

        return greetingService.saySomething();

    }
}
