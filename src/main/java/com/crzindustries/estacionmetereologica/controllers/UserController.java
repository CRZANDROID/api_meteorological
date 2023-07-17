package com.crzindustries.estacionmetereologica.controllers;

import com.crzindustries.estacionmetereologica.dtos.BaseResponse;
import com.crzindustries.estacionmetereologica.dtos.CreateUserRequest;
import com.crzindustries.estacionmetereologica.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService service;

    @PostMapping
    public ResponseEntity<BaseResponse> create(CreateUserRequest request) {
        BaseResponse baseResponse = service.create(request);

        return new ResponseEntity<>(baseResponse, baseResponse.getStatus());
    }
}
