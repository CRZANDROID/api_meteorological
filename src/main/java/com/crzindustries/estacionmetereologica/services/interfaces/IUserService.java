package com.crzindustries.estacionmetereologica.services.interfaces;

import com.crzindustries.estacionmetereologica.dtos.BaseResponse;
import com.crzindustries.estacionmetereologica.dtos.CreateUserRequest;

public interface IUserService {
    BaseResponse create(CreateUserRequest request);
}
