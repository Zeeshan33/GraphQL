package com.project.graphql.service;

import com.project.graphql.model.User;

public interface UserServiceMutation {

    User addUser(User user);

    User updateUser(User user);

    Boolean deleteUserById(Integer userId);

}
