package fr.emanuel.monbudget.transaction.controller;

import fr.emanuel.monbudget.global.AbstractCrudController;
import fr.emanuel.monbudget.transaction.model.Transaction;
import fr.emanuel.monbudget.transaction.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController extends AbstractCrudController<Transaction> {

    @Autowired
    private TransactionService service;

    public TransactionController(TransactionService service) {
        super(service);
    }
}
