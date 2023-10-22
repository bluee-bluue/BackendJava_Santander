package me.dio.santander.bootcamp.Repository;

import me.dio.santander.bootcamp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}