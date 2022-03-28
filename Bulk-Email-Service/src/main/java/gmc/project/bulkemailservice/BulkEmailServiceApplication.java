package gmc.project.bulkemailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import gmc.project.bulkemailservice.config.EmailConfigs;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties(EmailConfigs.class)
public class BulkEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkEmailServiceApplication.class, args);
	}

}
