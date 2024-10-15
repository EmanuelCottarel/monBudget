package fr.emanuel.monbudget.accounttype.controller;

import fr.emanuel.monbudget.accounttype.model.AccountType;
import fr.emanuel.monbudget.accounttype.service.AccountTypeService;
import fr.emanuel.monbudget.global.AbstractCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounttype")
public class AccountTypeController extends AbstractCrudController<AccountType> {

    @Autowired
    private AccountTypeService service;

    public AccountTypeController(AccountTypeService service) {
        super(service);
    }
}
