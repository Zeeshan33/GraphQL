package com.example.userdataservice;

import com.example.userdataservice.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping(value = "/data/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserDataServiceApplication.class, args);
	}

    @GetMapping("/")
    public List<User> getAllUser(){
        List<User> users = getAllUsers();

        return users;
    }

    @GetMapping("/{userId}")
    public Optional<User> getUserById(@PathVariable(name = "userId") Integer userId){
        List<User> users = getAllUsers();
        System.out.println("userId="+userId);
        Optional<User> user = users.stream().filter(u -> u.getId().equals(userId)).findFirst();
        System.out.println("userId="+user.get().getId());

        return user;
    }

    private List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Zee");
        user1.setLastName("Me");
        user1.setEmail("Zee@Me.com");
        user1.setAvatar("https://");

        users.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setFirstName("Me");
        user2.setLastName("Zee");
        user2.setEmail("Me@Zee.com");
        user2.setAvatar("http://");
        users.add(user2);

        User user3 = new User();
        user3.setId(3);
        user3.setFirstName("Me");
        user3.setLastName("Me");
        user3.setEmail("Me@Me.com");
        user3.setAvatar("No");
        users.add(user3);

        return users;
    }
}
