package co.com.doveracing.deliverymovements.domain.repository;

import co.com.doveracing.deliverymovements.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerRepository {
    List<Customer> getAll();

    Optional<List<Customer>> getByDocument(String documentType, String documentNumber);

    Optional<List<Customer>> getByPhoneNumber(String phoneNumber);

    Optional<Customer> getCustomer(Long customerId);

    Customer save(Customer customer);

    void delete(Long customerId);
}
