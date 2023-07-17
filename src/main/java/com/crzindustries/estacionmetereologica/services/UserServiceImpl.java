package com.crzindustries.estacionmetereologica.services;

import com.crzindustries.estacionmetereologica.dtos.BaseResponse;
import com.crzindustries.estacionmetereologica.dtos.CreateUserRequest;
import com.crzindustries.estacionmetereologica.entities.User;
import com.crzindustries.estacionmetereologica.repositories.UserRepository;
import com.crzindustries.estacionmetereologica.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public BaseResponse create(CreateUserRequest request) {
        User savedUser = repository.save(from(request));

        return BaseResponse.builder()
                .data(savedUser)
                .message("User created")
                .success(true)
                .status(HttpStatus.CREATED)
                .statusCode(HttpStatus.CREATED.value())
                .build();
    }

    private User from(CreateUserRequest request) {
        User user = new User();

        user.setFullName(request.getFullName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        return user;
    }
}
