package akshay.springframework.sfgpetclinic.controllers;

import akshay.springframework.sfgpetclinic.services.GreetingService;

public class PropertyInjectedController {
    GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
