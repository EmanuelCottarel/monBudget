package fr.emanuel.monbudget.transaction.repository;

import fr.emanuel.monbudget.transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
