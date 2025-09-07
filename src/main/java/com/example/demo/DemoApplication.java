package com.example.demo;

import com.example.demo.repository.LopHocRepo;
import com.example.demo.service.LopHocService;
import com.example.demo.view.LopHocView;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Annotation
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		LopHocRepo lopHocRepo = new LopHocRepo();
		LopHocService lopHocService = new LopHocService(lopHocRepo);
		LopHocView lopHocView = new LopHocView(lopHocService);
		lopHocView.start();

	}
}
