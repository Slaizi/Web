package ru.Bogachev.bysell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.Bogachev.bysell.models.User;

public interface UserRepository extends JpaRepository <User, Long> {
    User findByEmail(String email);
}
