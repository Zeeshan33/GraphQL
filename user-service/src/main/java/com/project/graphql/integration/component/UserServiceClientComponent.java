package com.project.graphql.integration.component;

import com.project.graphql.integration.client.UserServiceClient;
import com.project.graphql.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@SuppressWarnings({"squid:S1166"})
public class UserServiceClientComponent {

    @Autowired
    private UserServiceClient userServiceClient;

    public List<User> getAllUsers() throws Exception {
        List<User> users = userServiceClient.getAllUsers();

        return users;
    }

    public User getUserById(Integer userId) throws Exception {
        User user = userServiceClient.getUserById(userId);

        return user;
    }
}
