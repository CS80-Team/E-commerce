package swe.project.ecommerce.service.Impl;

import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.UserDTO;
import swe.project.ecommerce.mapper.UserMapper;
import swe.project.ecommerce.model.User;
import swe.project.ecommerce.repository.UserRepository;
import swe.project.ecommerce.service.UserService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream().map(UserMapper::mapToUserDTO).collect(Collectors.toList());
    }

    @Override
    public UserDTO getUserById(UUID id) {
        return userRepository.findById(id).map(UserMapper::mapToUserDTO).orElse(null);
    }

    @Override
    public void createUser(UserDTO userDTO) {
        User user = UserMapper.mapToUser(userDTO);
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(UUID id) {
        userRepository.deleteById(id);
    }
}
