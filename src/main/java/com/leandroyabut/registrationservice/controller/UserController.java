package com.leandroyabut.registrationservice.controller;

import com.leandroyabut.registrationservice.dto.UserRegistration;
import com.leandroyabut.registrationservice.dto.UserResponse;
import com.leandroyabut.registrationservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable Integer id) {
        return userService.mapToResponse(userService.getUserById(id));
    }

    @PostMapping("/registration")
    public UserResponse registerUser(@RequestBody @Valid UserRegistration registration) {
        return userService.mapToResponse(userService.registerUser(registration));
    }

}
