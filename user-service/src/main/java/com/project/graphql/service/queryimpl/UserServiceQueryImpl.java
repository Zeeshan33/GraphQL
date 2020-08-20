package com.project.graphql.service.queryimpl;

import com.project.graphql.integration.component.UserServiceClientComponent;
import com.project.graphql.model.User;
import com.project.graphql.service.UserServiceQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceQueryImpl implements UserServiceQuery {

    @Autowired
    private UserServiceClientComponent userServiceClientComponent;

    public List<User> allUsers() throws Exception {
        return userServiceClientComponent.getAllUsers();
    }

    public User userById(Integer userId) throws Exception {
        return userServiceClientComponent.getUserById(userId);
    }

}
