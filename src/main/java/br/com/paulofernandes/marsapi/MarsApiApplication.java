package br.com.paulofernandes.marsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@SpringBootApplication
public class MarsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarsApiApplication.class, args);
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {
		final ResourceBundleMessageSource messageResource = new ResourceBundleMessageSource();
		messageResource.setBasename("messages/messages");
		return messageResource;
	}

}
