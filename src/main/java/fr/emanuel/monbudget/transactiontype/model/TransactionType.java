package fr.emanuel.monbudget.transactiontype.model;

import fr.emanuel.monbudget.transaction.model.Transaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class TransactionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @OneToMany(mappedBy = "type")
    private List<Transaction> transactions;
}
