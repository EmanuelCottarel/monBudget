package fr.emanuel.monbudget.accounttype.model;

import fr.emanuel.monbudget.account.model.Account;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class AccountType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double interestRate;

    @OneToMany(mappedBy = "type")
    private List<Account> accounts;
}
