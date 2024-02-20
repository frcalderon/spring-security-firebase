package com.frcalderon.spring_security_firebase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

    @GetMapping("/test")
    public String test(Principal principal) {
        return principal.getName();
    }
}
