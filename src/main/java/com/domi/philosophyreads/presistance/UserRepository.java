package com.domi.philosophyreads.presistance;
import com.domi.philosophyreads.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
