package com.example.springboot_aws_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.TimeZone;

@SpringBootApplication
@RestController
public class SpringbootAwsDemoApplication {

	@CrossOrigin(origins = "*") // Allow all origins
	@RequestMapping("/")
	public  String testMethod(){
		System.out.println("Entered method"+ System.currentTimeMillis());
		return "Success! Welcome to aws";
	}

	@GetMapping("/api/greet/{name}")
	public String greet(@PathVariable String name) {
		return "<html><body style='font-family: Arial, sans-serif;'>" +
				"<h1 style='color: #3498db;'>Hello, " + name + "!</h1>" +
				"<p style='color: #e74c3c;'>Hi Vivaan</p>" +
				"<p style='color: #e74c3c;'>This is after settingup the pipeline......</p>" +
				"</body></html>";
	}



	public static void main(String[] args) {
		SpringApplication.run(SpringbootAwsDemoApplication.class, args);
	}

}
