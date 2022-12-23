package com.charliegamboa.whereismymoney.security.whereismymoneysecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping("/hello")
    public String getMessage(){
        var auth = SecurityContextHolder.getContext().getAuthentication();
        logger.info("User data: {}", auth.getPrincipal());
        logger.info("User permissions: {}", auth.getAuthorities());
        logger.info("User authenticated?: {}", auth.isAuthenticated());
        return "Yea !";
    }

    @GetMapping("/public")
    public String getPublicMessage(){
        var auth = SecurityContextHolder.getContext().getAuthentication();
        logger.info("User data: {}", auth.getPrincipal());
        logger.info("User permissions: {}", auth.getAuthorities());
        logger.info("User authenticated?: {}", auth.isAuthenticated());
        return "Yea !";
    }
    @GetMapping("/admin")
    public String getAdminMessage(){
        var auth = SecurityContextHolder.getContext().getAuthentication();
        logger.info("User data: {}", auth.getPrincipal());
        logger.info("User permissions: {}", auth.getAuthorities());
        logger.info("User authenticated?: {}", auth.isAuthenticated());
        return "Yea !";
    }

}
