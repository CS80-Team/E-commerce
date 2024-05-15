package swe.project.ecommerce.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "users")
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@SuperBuilder
public class User extends Person {

    private LocalDateTime userCreationDate;

    public User() {
        super();
    }

    public User(UUID id,
                byte[] profile_pic,
                String first_name,
                String last_name,
                String username,
                String email,
                String password,
                boolean emailVerified,
                ArrayList<Address> addressList,
                LocalDateTime userCreationDate) {
        super(id, profile_pic, first_name, last_name, username, email, password, emailVerified, addressList);
        this.userCreationDate = userCreationDate;
    }
}
