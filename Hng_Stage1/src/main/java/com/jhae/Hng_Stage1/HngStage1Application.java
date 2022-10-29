package com.jhae.Hng_Stage1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class HngStage1Application {

	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<Model> showUser() {
		Model model = new Model();
		return ResponseEntity.ok(model);
	}

	public static void main(String[] args) {
		SpringApplication.run(HngStage1Application.class, args);
	}

}
