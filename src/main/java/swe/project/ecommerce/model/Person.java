package swe.project.ecommerce.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue
    private Integer id;

    private byte[] profile_pic;
    private String first_name;
    private String last_name;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private boolean emailVerified = false;

    @OneToMany
    private List<Address> addressList;
}
