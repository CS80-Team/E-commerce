package swe.project.ecommerce.mapper;


import org.springframework.stereotype.Service;
import swe.project.ecommerce.dto.UserDTO;
import swe.project.ecommerce.model.User;


@Service
public class UserMapper {
    public static UserDTO mapToUserDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getFirst_name(),
                user.getLast_name(),
                user.getEmail(),
                user.getUsername(),
                user.isEmailVerified()
        );
    }

    public static User mapToUser(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.id());
        user.setFirst_name(userDTO.first_name());
        user.setLast_name(userDTO.last_name());
        user.setEmail(userDTO.email());
        user.setEmailVerified(userDTO.emailVerified());
        return user;
    }
}
