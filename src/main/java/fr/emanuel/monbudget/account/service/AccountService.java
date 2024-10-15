package fr.emanuel.monbudget.account.service;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.account.repository.AccountRepository;
import fr.emanuel.monbudget.global.AbstractCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService extends AbstractCrudService<Account> {

    @Autowired
    private AccountRepository accountRepository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public List<Account> findByUser(long id) {
        return this.accountRepository.findByUser_Id(id);
    }
}
