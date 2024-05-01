package swe.project.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.dto.UserDTO;
import swe.project.ecommerce.service.impl.UserServiceImpl;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/e-commerce/users")
public class UserController {
    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<UserDTO> getAllUsers() {
        return userService.getAllEntities();
    }

    @GetMapping("/{id}")
    public UserDTO getById(@PathVariable UUID id) {
        return userService.getEntityById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public void createUser(@RequestBody UserDTO userDTO) {
        userService.create(userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        userService.deleteEntity(id);
    }

}
