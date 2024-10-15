package fr.emanuel.monbudget.accounttype.repository;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.accounttype.model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
}
