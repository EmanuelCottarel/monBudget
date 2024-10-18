package fr.emanuel.monbudget.transactiontype.controller;

import fr.emanuel.monbudget.account.service.AccountService;
import fr.emanuel.monbudget._global.AbstractCrudController;
import fr.emanuel.monbudget.transactiontype.model.TransactionType;
import fr.emanuel.monbudget.transactiontype.service.TransactionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactiontyope")
public class TransactionTypeController extends AbstractCrudController<TransactionType> {

    @Autowired
    private AccountService service;

    public TransactionTypeController(TransactionTypeService service) {
        super(service);
    }
}
