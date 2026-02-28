package com.pk.keycloak.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @GetMapping("/public")
    public String publicApi() {
        return "Public API - No Authentication Required";
    }

    @GetMapping("/user")
    public String userApi() {
        return "User API - USER role required";
    }

    @GetMapping("/admin")
    public String adminApi() {
        return "Admin API - ADMIN role required";
    }
}
