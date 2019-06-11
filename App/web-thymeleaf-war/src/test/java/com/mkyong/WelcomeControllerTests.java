package com.mkyong;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomeControllerTests {
// inject via application.properties
    @Value("${welcome.message}")
    private String message;


@Test
public void testExample() throws Exception {
assertNotNull(message);
}
}




