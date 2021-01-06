package edu.nitt.delta.meettracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class MeetTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetTrackerApplication.class, args);
	}

}
