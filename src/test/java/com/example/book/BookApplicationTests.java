package com.example.book;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.longThat;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class BookApplicationTests {

	Logger logger=(Logger) LoggerFactory.getLogger(BookApplicationTests.class);

	@Test
	public void contextLoads(){

		logger.info("Test case executing..");
		assertEquals(true, true);
	}
}
