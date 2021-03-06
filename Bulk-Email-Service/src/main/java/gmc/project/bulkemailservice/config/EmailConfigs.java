package gmc.project.bulkemailservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Configuration
@ConfigurationProperties(prefix = "mail")
public class EmailConfigs {

	private String senderMailId;
	private String senderPassword;
	
}
