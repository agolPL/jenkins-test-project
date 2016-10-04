package pl.agol.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String... args) {
        new SpringApplication(JenkinsTestApplication.class)
                .run(args);
    }
}
