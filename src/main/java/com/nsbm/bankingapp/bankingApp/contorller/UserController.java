package com.nsbm.bankingapp.bankingApp.contorller;

import com.nsbm.bankingapp.bankingApp.model.UsersModel;
import com.nsbm.bankingapp.bankingApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping  // Maps POST requests to /api/v1/users
    public UsersModel insertUser(@RequestBody UsersModel user) {
        return userService.insert(user);
    }

    // Additional REST methods for fetching, updating, deleting users
}
