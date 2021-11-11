package com.logging.LogApp;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	// TODO Auto-generated constructor stub
	@Autowired
	LogsRepository logsRepository;
	
	Logger log = Logger.getLogger(LogAppApplication.class.getName());
	
	@GetMapping("/")
	public String log() {
		log.debug("Debug");
	    log.info("Info");
	    logsRepository.save(new logs());
	    return "logged successfully";
	}
}
