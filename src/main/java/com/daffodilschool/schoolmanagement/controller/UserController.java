package com.daffodilschool.schoolmanagement.controller;


import com.daffodilschool.schoolmanagement.config.JwtService;
import com.daffodilschool.schoolmanagement.dto.LoginUserDto;
import com.daffodilschool.schoolmanagement.dto.UserDTO;
import com.daffodilschool.schoolmanagement.entity.User;
import com.daffodilschool.schoolmanagement.response.LoginResponse;
import com.daffodilschool.schoolmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/auth")

public class UserController {
    private final JwtService jwtService;

    private final UserService authenticationService;

    public UserController(JwtService jwtService, UserService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup")
    public ResponseEntity<User> register(@RequestBody UserDTO registerUserDto) {
        User registeredUser = authenticationService.createUser(registerUserDto);

        return ResponseEntity.ok(registeredUser);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> authenticate(@RequestBody LoginUserDto loginUserDto) {
        User authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginResponse loginResponse = new LoginResponse("200","user Login Successfully",jwtToken,jwtService.getExpirationTime());

        return ResponseEntity.ok(loginResponse);
    }
}
