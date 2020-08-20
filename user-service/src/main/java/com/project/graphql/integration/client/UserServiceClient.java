package com.project.graphql.integration.client;

import com.project.graphql.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static com.project.graphql.integration.constants.FeignClientConstants.USER_ID_PARAM;
import static com.project.graphql.integration.constants.FeignClientConstants.USER_ID_URI;

@FeignClient(name = "${user.service.name}", url = "${user.service.url}")
public interface UserServiceClient {

    @GetMapping(path = "${user.service.path}", consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    List<User> getAllUsers() throws Exception;

    @GetMapping(path = "${user.service.path}" + USER_ID_URI, consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
    User getUserById(@PathVariable(name = USER_ID_PARAM) Integer userId) throws Exception;
}
