package com.gbabler.msusers.controller;

import com.gbabler.msusers.model.dto.UserResponse;
import com.gbabler.msusers.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * CRUD
     * Create - verbo http POST /users - Status code = 201 (CREATED)
     * Read - verbo http GET /users - GET por ID /users/{userId} - Status code = 200 (OK)
     * Update - verbo http PUT - /users - Status code = 204 (NO CONTENT)
     * Delete - verbo http DELETE - /users/{userId} - Status code = 204 (NO CONTENT)
     */

    /**
     * GET /users
     * Responsável por trazer todos os usuários da base de dados.
     */
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getUsers() {
        return userService.getUsers();
    }
}