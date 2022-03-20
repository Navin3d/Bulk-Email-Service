package gmc.project.bulkemail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BulkEmailDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkEmailDiscoveryServiceApplication.class, args);
	}

}
