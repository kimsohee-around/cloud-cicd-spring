package org.iclass.spring_9jwt;

import static org.junit.jupiter.api.Assertions.*;

import org.iclass.spring_9jwt.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class Spring9jwtApplicationTests {

	@Autowired
	UserRepository repository;

	@Test
	void contextLoads() {
		log.info("🎫{}", repository.findAll());
		assertNotEquals(0, repository.findAll().size());
	}

}
