package org.edwith.webbe.securityexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SecurityexamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityexamApplication.class, args);
    }

}
