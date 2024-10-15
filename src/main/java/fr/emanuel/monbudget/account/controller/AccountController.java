package fr.emanuel.monbudget.account.controller;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.account.service.AccountService;
import fr.emanuel.monbudget.global.AbstractCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController extends AbstractCrudController<Account> {

    @Autowired
    private AccountService service;

    public AccountController(AccountService service) {
        super(service);
    }

    @GetMapping("findby-user/{id}")
    public List<Account> findbyUser(@PathVariable long id) {
        return this.service.findByUser(id);
    }
}
