package gmc.project.bulkemailservice.models;

import lombok.Data;

@Data
public class MailingModel {
	
	private String from;
	private String to;
	private String subject;
	private String compost;
	
}
