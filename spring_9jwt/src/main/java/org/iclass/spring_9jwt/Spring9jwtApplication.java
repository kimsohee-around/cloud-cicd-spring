package org.iclass.spring_9jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Spring9jwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring9jwtApplication.class, args);
	}

}
