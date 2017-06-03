package cz.meza.spring.boot.camel;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCamelExampleTests {

	@Produce
	private ProducerTemplate producerTemplate;

	@Test
	public void contextLoads() {
		System.out.println("d");
	}

}
