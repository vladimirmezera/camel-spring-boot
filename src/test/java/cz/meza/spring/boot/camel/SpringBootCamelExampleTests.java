package cz.meza.spring.boot.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultExchange;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCamelExampleTests {

	@Produce(uri = "direct:getInfo")
	private ProducerTemplate producerGetInfo;

	@Autowired
	private CamelContext camelContext;

	private static final String BASIC_INFORMATION = "Basic information";

	@Test
	public void testBasicInformation() {
		Exchange exchange = producerGetInfo.send(new DefaultExchange(camelContext));
		Assert.assertEquals(BASIC_INFORMATION, exchange.getIn().getBody());
	}

	

}
