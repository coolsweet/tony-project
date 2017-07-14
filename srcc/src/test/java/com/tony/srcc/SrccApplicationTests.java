package com.tony.srcc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SrccApplication.class)
@IntegrationTest("server.port:8888") 
public class SrccApplicationTests {

	@Test
	public void contextLoads() {
	}

}
