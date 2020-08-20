package com.project.graphql;

import com.project.graphql.model.User;
import com.project.graphql.service.queryimpl.UserServiceQueryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EnableFeignClients
public class GraphqlApplication {

    @Autowired
    private UserServiceQueryImpl userServiceQuery;

    @GetMapping("/all")
    public List<User> getAllUser() throws Exception {
        List<User> users = userServiceQuery.allUsers();
        System.out.println("users.get(0).getId() + = + users.get(0).getEmail()" + "=");

        return users;
    }

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

}
