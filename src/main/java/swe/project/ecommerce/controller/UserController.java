package swe.project.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.UserDTO;
import swe.project.ecommerce.model.User;
import swe.project.ecommerce.service.UserService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/e-commerce/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable UUID id) {
        return userService.getUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createUser(@RequestBody UserDTO user) {
        userService.createUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        userService.deleteUserById(id);
    }

}
