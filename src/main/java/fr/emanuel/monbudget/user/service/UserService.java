package fr.emanuel.monbudget.user.service;

import fr.emanuel.monbudget._global.AbstractCrudService;
import fr.emanuel.monbudget.user.model.User;
import fr.emanuel.monbudget.user.model.UserRole;
import fr.emanuel.monbudget.user.repository.UserRepository;
import fr.emanuel.monbudget.user.repository.UserRoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<User> {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserRoleRepository userRoleRepository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @PostConstruct
    public void init(){
        UserRole adminRole = new UserRole();
        adminRole.setName("ADMIN");
        UserRole userRole = new UserRole();
        userRole.setName("USER");

        userRoleRepository.save(userRole);
        userRoleRepository.save(adminRole);

        User adminInfo = new User();
        adminInfo.setUsername("admin");
        adminInfo.setPassword(passwordEncoder.encode("admin"));
        adminInfo.getRoles().add(adminRole);

        User userInfo = new User();
        userInfo.setUsername("user");
        userInfo.setPassword(passwordEncoder.encode("user"));
        userInfo.getRoles().add(userRole);


        userRepository.save(adminInfo);
        userRepository.save(userInfo);
    }

    public User findByUsername(String username){
        return this.userRepository.findByUsername(username);
    }
}
