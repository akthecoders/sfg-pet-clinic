package akshay.springframework.sfgpetclinic;

import akshay.springframework.sfgpetclinic.controllers.MyController;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx;
        ctx = run(SfgPetClinicApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        String greeting = myController.sayHello();

        System.out.println(greeting);
    }

}
