package cz.meza.spring.boot.camel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication
public class SpringBootCamelExampleApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelExampleApp.class, args);
	}
}
