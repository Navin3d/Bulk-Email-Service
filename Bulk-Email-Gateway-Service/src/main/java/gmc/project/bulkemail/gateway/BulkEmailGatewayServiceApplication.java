package gmc.project.bulkemail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BulkEmailGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkEmailGatewayServiceApplication.class, args);
	}

}
