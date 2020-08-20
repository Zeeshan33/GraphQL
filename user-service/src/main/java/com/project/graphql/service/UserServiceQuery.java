package com.project.graphql.service;

import com.project.graphql.model.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceQuery {

    List<User> allUsers() throws Exception;

    User userById(Integer userId) throws Exception;

}
