package oidc.practice.oidcpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam("isHello") Boolean isHello) {
        return isHello.booleanValue() ? "isHello" : "isNotHello";
    }

}