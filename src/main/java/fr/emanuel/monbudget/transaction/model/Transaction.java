package fr.emanuel.monbudget.transaction.model;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.category.model.Category;
import fr.emanuel.monbudget.transactiontype.model.TransactionType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double amount;

    @ManyToOne
    private Account account;

    @ManyToOne
    private TransactionType type;

    @ManyToOne
    private Category category;
}
