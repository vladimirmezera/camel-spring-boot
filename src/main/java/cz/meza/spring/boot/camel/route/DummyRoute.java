package cz.meza.spring.boot.camel.route;

import org.apache.camel.builder.RouteBuilder;

/**
 *  Dummy route
 */
public class DummyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:getInfo").process(exchange -> {
            exchange.getIn().setBody("Basic information");
        });
    }
}
