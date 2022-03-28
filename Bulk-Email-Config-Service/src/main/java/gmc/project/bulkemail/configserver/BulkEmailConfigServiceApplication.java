package gmc.project.bulkemail.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class BulkEmailConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BulkEmailConfigServiceApplication.class, args);
	}

}
