package swe.project.ecommerce.service;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(UUID id);
    void createUser(User user);
    void deleteUserById(UUID id);
}
