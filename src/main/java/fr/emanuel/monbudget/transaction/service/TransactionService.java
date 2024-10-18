package fr.emanuel.monbudget.transaction.service;

import fr.emanuel.monbudget._global.AbstractCrudService;
import fr.emanuel.monbudget.transaction.model.Transaction;
import fr.emanuel.monbudget.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractCrudService<Transaction> {
    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }
}
