package gmc.project.bulkemailservice;

import lombok.Data;

@Data
public class MailingModel {
	
	private String from;
	private String to;
	private String subject;
	private String compose;
	
}
