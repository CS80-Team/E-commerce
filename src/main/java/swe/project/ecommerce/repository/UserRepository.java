package swe.project.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import swe.project.ecommerce.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
