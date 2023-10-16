package com.camber.user.service.services;

import com.camber.user.service.entities.UserEntity;
import java.util.List;

public interface UserService {
    //create
    UserEntity saveUser(UserEntity user);

    //get all users
    List<UserEntity> getAllUser();

    //get single user of given userId -> buscar practicamente
    UserEntity getUser(String userId);

    //TODO: delete
    //TODO: update
}
