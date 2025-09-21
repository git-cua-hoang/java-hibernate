package com.example.demo;

import com.example.demo.repository.LopHocRepo;
import com.example.demo.repository.LopHocRepository;
import com.example.demo.service.LopHocService;
import com.example.demo.view.LopHocView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //Annotation
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private LopHocService lopHocService; // ✅ lấy bean từ Spring

	@Autowired
	private LopHocView lopHocView; // nếu LopHocView cũng được đánh @Component/@Service

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		lopHocView.start();
	}
}
