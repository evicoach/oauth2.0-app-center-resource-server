package com.columnhack.ws.api.AppCenterResourceServer.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/token")
public class TokenController {

    @GetMapping
    public /*Map<String, Object>*/ Jwt getToken(@AuthenticationPrincipal Jwt jwt) {
//        return Collections.singletonMap("principal", jwt);
        return jwt;
    }
}
