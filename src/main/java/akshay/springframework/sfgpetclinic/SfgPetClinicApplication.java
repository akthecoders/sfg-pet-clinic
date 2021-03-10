package akshay.springframework.sfgpetclinic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
public class SfgPetClinicApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx;
        ctx = run(SfgPetClinicApplication.class, args);
    }

}
