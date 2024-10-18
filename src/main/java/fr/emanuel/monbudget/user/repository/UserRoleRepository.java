package fr.emanuel.monbudget.user.repository;

import fr.emanuel.monbudget.user.model.UserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRoleRepository extends CrudRepository<UserRole, Long> {
}

