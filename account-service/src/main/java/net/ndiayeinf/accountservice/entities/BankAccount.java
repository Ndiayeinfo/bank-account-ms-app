package net.ndiayeinf.accountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.ndiayeinf.accountservice.enums.AccountType;
import net.ndiayeinf.accountservice.model.Customer;

import java.time.LocalDate;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor @Builder
@Entity
public class BankAccount {

    @Id
    private String accountId;
    private double balance;
    private LocalDate createAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}
