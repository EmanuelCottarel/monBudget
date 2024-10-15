package fr.emanuel.monbudget.user.service;

import fr.emanuel.monbudget.global.AbstractCrudService;
import fr.emanuel.monbudget.user.model.User;
import fr.emanuel.monbudget.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<User> {
    public UserService(UserRepository repository) {
        this.repository = repository;
    }
}
