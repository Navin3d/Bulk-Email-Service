package gmc.project.bulkemailservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gmc.project.bulkemailservice.config.EmailConfigs;

@RestController
@RequestMapping(path = "/email")
public class EmailController {
	
	@Autowired
	private EmailConfigs emailConfigs;
	
	@Autowired
	private Environment env;

	@GetMapping(path = "/server/status/check")
	public String checkServerStatus() {
		return "This is Working Ig: " + emailConfigs.getDevelopername();
	}
	
	@GetMapping(path = "/server/status/check/env")
	public String checkServerStatusEnv() {
		return "This is Working Ig: " + env.getProperty("local.server.port");
	}
	
}
