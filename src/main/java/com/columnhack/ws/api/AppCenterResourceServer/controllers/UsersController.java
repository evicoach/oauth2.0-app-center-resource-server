package com.columnhack.ws.api.AppCenterResourceServer.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    @GetMapping("/status/check")
    public String status() {
        return "Working...";
    }

    //    @Secured("ROLE_developer")
    @PreAuthorize("hasRole('developer') or #userId == #jwt.subject")
    @DeleteMapping(path = "/{id}")
    public String deleteUser(@PathVariable("id") String userId,
                             @AuthenticationPrincipal Jwt jwt) {
//        return "Deleted user with ID " + userId + " and JWT subject " + jwt.getClaims().get("sub");
        return "Deleted user with ID " + userId + " and JWT subject " + jwt.getSubject();
    }
}
