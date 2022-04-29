package com.leandroyabut.registrationservice.service;

import com.leandroyabut.registrationservice.dto.UserRegistration;
import com.leandroyabut.registrationservice.dto.UserResponse;
import com.leandroyabut.registrationservice.exception.EmailExistsException;
import com.leandroyabut.registrationservice.exception.UserNotFoundException;
import com.leandroyabut.registrationservice.exception.UsernameExistsException;
import com.leandroyabut.registrationservice.model.User;
import com.leandroyabut.registrationservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final ModelMapper modelMapper;

    public User getUserById(Integer id) {
        return repository.findById(id).orElseThrow(UserNotFoundException::new);
    }

    public User registerUser(@Valid UserRegistration registration) {
        if (repository.existsByUsername(registration.getUsername()))
            throw new UsernameExistsException();

        if (repository.existsByEmail(registration.getEmail()))
            throw new EmailExistsException();

        User user = modelMapper.map(registration, User.class);
        return repository.save(user);
    }

    public UserResponse mapToResponse(User user) {
        return modelMapper.map(user, UserResponse.class);
    }

}


