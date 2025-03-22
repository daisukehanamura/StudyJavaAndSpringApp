package com.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class StudyJavaAndSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudyJavaAndSpringApplication.class, args);
		System.out.print("HelloWorld");
		List<String> test = new ArrayList<>();
		test.add("test");
	}
}
