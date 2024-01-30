package net.ndiayeinf.accountservice.repository;

import net.ndiayeinf.accountservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
