package com.gitcodings.stack.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class MyApiController {
    @GetMapping("/hello/{name}")
    public ResponseEntity<String> helloWorld(@PathVariable String name)
    {
        PojoResponseModel response = new PojoResponseModel();
        response.setName(Integer.valueOf("Example"));

        return ResponseEntity.status(HttpStatus.OK)
                .body("Hello " + name + "!");
    }
}
