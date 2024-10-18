package fr.emanuel.monbudget.transactiontype.service;

import fr.emanuel.monbudget._global.AbstractCrudService;
import fr.emanuel.monbudget.transactiontype.model.TransactionType;
import fr.emanuel.monbudget.transactiontype.repository.TransactionTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionTypeService extends AbstractCrudService<TransactionType> {
    public TransactionTypeService(TransactionTypeRepository repository) {
        this.repository = repository;
    }
}
