package fr.emanuel.monbudget.user.model;

import fr.emanuel.monbudget.account.model.Account;
import fr.emanuel.monbudget.transaction.model.Transaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user_")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Account> accounts = new ArrayList<>();


}
