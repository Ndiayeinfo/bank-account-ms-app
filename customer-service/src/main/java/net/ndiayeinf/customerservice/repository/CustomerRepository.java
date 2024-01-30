package net.ndiayeinf.customerservice.repository;

import net.ndiayeinf.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
