package com.project.graphql.service.mutationimpl;

import com.project.graphql.integration.component.UserServiceClientComponent;
import com.project.graphql.model.User;
import com.project.graphql.service.UserServiceMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceMutationImpl implements UserServiceMutation
{
    @Autowired
    private UserServiceClientComponent userServiceClientComponent;

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public Boolean deleteUserById(Integer userId) {
        return null;
    }
}
