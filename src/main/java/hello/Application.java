package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        System.out.println("Spring Boot Applicaiton Started ...");
        SpringApplication.run(Application.class, args);
    }
}
