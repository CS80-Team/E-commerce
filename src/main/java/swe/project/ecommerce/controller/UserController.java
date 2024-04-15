package swe.project.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import swe.project.ecommerce.model.User;
import swe.project.ecommerce.repository.UserRepository;

import java.util.List;

@RestController
@RequestMapping(path = "/e-commerce/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void createUser(@RequestBody User user) {
        repository.save(user);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        repository.deleteById(id);
    }

    @DeleteMapping
    public void deleteAllUsers() {
        repository.deleteAll();
    }

}
