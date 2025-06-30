package io.codebetter.spring.rest.spring.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

        @RequestMapping("/")
        public ResponseEntity<String> getBook() {
                return ResponseEntity.ok("Hello World");
        }
}