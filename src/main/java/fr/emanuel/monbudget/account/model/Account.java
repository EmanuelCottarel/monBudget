package fr.emanuel.monbudget.account.model;

import fr.emanuel.monbudget.accounttype.model.AccountType;
import fr.emanuel.monbudget.transaction.model.Transaction;
import fr.emanuel.monbudget.user.model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private double balance;

    @ManyToOne
    private AccountType type;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;

    @ManyToOne
    private User user;
}
