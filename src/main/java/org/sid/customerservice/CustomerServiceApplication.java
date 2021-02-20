package org.sid.customerservice;

import org.sid.customerservice.entities.customer;
import org.sid.customerservice.repository.customerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(customerRepository customerRepository,
							 RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(customer.class);
		return args -> {
			customerRepository.save(new customer(null, "Amin","med@gmail.com"));
			customerRepository.save(new customer(null, "Rim","m@gmail.com"));
			customerRepository.save(new customer(null, "iman","iman@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
}
