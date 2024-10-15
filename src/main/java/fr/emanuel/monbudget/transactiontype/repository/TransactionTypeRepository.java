package fr.emanuel.monbudget.transactiontype.repository;

import fr.emanuel.monbudget.transactiontype.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionTypeRepository extends JpaRepository<TransactionType, Long> {
}
