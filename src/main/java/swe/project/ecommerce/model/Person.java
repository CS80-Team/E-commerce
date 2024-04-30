package swe.project.ecommerce.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Getter
@Setter
@SuperBuilder
@MappedSuperclass
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private UUID id;

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

    public Person() {}

    public Person(UUID id,
                  byte[] profile_pic,
                  String first_name,
                  String last_name,
                  String username,
                  String email,
                  String password,
                  boolean emailVerified,
                  ArrayList<Address> addressList) {
        this.id = id;
        this.profile_pic = profile_pic;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.emailVerified = emailVerified;
        this.addressList = addressList;
    }
}
