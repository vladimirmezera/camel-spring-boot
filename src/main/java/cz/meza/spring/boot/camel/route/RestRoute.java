package cz.meza.spring.boot.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

/**
 *  Basic rest route.
 */
@Component
public class RestRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        //basic rest configuration
        restConfiguration()
                .contextPath("/example").apiContextPath("/api-doc")
                .apiProperty("api.title", "Spring boot camel example REST API")
                .apiProperty("api.version", "1.0")
                .apiProperty("cors", "true")
                .apiContextRouteId("doc-api")
                .bindingMode(RestBindingMode.json);

        rest("").description("Get basic information")
                .consumes(MediaType.TEXT_PLAIN_VALUE).produces(MediaType.TEXT_PLAIN_VALUE)
                .get("/info").description("Get info").to("direct:getInfo");

    }
}
