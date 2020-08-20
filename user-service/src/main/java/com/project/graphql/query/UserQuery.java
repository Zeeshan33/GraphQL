package com.project.graphql.query;

import com.project.graphql.model.User;
import com.project.graphql.service.queryimpl.UserServiceQueryImpl;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQuery implements GraphQLQueryResolver {

    @Autowired
    private UserServiceQueryImpl userServiceQuery;

    public List<User> allUsers() throws Exception {
        return userServiceQuery.allUsers();
    }

    public String hello(final String who) {
        return "Name="+who;
    }

    public User userById(Integer userId) throws Exception {
        User user = userServiceQuery.userById(userId);
        return user;
    }
}
