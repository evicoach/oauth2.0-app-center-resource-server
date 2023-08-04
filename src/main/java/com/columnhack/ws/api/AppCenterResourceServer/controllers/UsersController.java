package com.columnhack.ws.api.AppCenterResourceServer.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public String status() {
        return "Working...";
    }

    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") String userId) {
        return "Deleted user with ID " + userId;
    }
}
