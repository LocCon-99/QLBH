package com.example.Jenkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinApplication {

	@GetMapping("/v1")
	public String test(){
		return "hello";
	}

	public static void main(String[] args) {
		SpringApplication.run(JenkinApplication.class, args);
	}
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/LocCon-99/QLBH.git
//	git push -u origin main

}
