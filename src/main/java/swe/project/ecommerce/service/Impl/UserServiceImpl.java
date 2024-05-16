package swe.project.ecommerce.service.Impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.UserDTO;
import swe.project.ecommerce.mapper.impl.UserMapper;
import swe.project.ecommerce.model.User;
import swe.project.ecommerce.repository.UserRepository;
import swe.project.ecommerce.service.CrudService;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements CrudService<User, UserDTO> {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public void create(UserDTO userDTO) {
        userRepository.save(userMapper.mapToEntity(userDTO));
    }

    @Override
    public List<UserDTO> getAllEntities() {
        return userRepository.findAll().stream().map(userMapper::mapToDTO).collect(Collectors.toList());
    }

    public List<UserDTO> getAllEntitiesById(UUID entityId) {
        return null;
    }

    @Override
    public UserDTO getEntityById(UUID entityId) {
        return userRepository.findById(entityId).map(userMapper::mapToDTO).orElse(null);
    }

    @Override
    public ResponseEntity<String> updateEntity(UUID entityUuid, UserDTO userDTO) {
        return null;
    }

    @Override
    public void deleteEntity(UUID entityUuid) {
        userRepository.deleteById(entityUuid);
    }
}
