package swe.project.ecommerce.service;

import swe.project.ecommerce.dto.UserDTO;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(UUID id);
    void createUser(UserDTO user);
    void deleteUserById(UUID id);
}
