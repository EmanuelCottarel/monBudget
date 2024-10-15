package fr.emanuel.monbudget.user.repository;

import fr.emanuel.monbudget.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
