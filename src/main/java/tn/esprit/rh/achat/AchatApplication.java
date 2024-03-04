package tn.esprit.rh.achat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class AchatApplication {
    //test

    public static void main(String[] args) {
        SpringApplication.run(AchatApplication.class, args);
    }

}
