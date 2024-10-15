package fr.emanuel.monbudget.account.repository;

import fr.emanuel.monbudget.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {

    List<Account> findByUser_Id(long id);
}
