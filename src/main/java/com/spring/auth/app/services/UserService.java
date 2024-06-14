package com.spring.auth.app.services;

import com.spring.auth.app.dtos.UserRequest;
import com.spring.auth.app.dtos.UserResponse;

import java.util.List;


public interface UserService {

    UserResponse saveUser(UserRequest userRequest);

    UserResponse getUser();

    List<UserResponse> getAllUser();


}
