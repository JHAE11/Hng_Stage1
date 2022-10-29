package com.jhae.Hng_Stage1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping
    public ResponseEntity<Model> showUser() {
        Model model = new Model();
        return ResponseEntity.ok(model);
    }
}
