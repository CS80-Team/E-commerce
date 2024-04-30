package swe.project.ecommerce.mapper;


import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.UserDTO;
import swe.project.ecommerce.model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;


@Service
public class UserMapper {
    public static UserDTO mapToUserDTO(User user) {
        return new UserDTO (
                user.getId(),
                user.getFirst_name(),
                user.getLast_name(),
                user.getUsername(),
                user.getEmail(),
                user.isEmailVerified()
        );
    }

    public static User mapToUser(UserDTO userDTO) {
        return new User(
                userDTO.id(),
                new byte[10],
                userDTO.first_name(),
                userDTO.last_name(),
                userDTO.username(),
                userDTO.email(),
                "Hashed Password",
                userDTO.emailVerified(),
                new ArrayList<>(),
                LocalDateTime.now()
        );
    }
}
