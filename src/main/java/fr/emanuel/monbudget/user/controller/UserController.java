package fr.emanuel.monbudget.user.controller;

import fr.emanuel.monbudget.account.service.AccountService;
import fr.emanuel.monbudget.global.AbstractCrudController;
import fr.emanuel.monbudget.user.model.User;
import fr.emanuel.monbudget.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractCrudController<User> {

    @Autowired
    private AccountService service;

    public UserController(UserService service) {
        super(service);
    }

}
