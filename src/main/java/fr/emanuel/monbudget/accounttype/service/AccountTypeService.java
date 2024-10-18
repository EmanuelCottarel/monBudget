package fr.emanuel.monbudget.accounttype.service;

import fr.emanuel.monbudget.accounttype.model.AccountType;
import fr.emanuel.monbudget.accounttype.repository.AccountTypeRepository;
import fr.emanuel.monbudget._global.AbstractCrudService;
import org.springframework.stereotype.Service;

@Service
public class AccountTypeService extends AbstractCrudService<AccountType> {
    public AccountTypeService(AccountTypeRepository repository) {
        this.repository = repository;
    }
}
