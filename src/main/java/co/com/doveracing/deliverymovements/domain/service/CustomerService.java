package co.com.doveracing.deliverymovements.domain.service;

import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    public List<Customer> getAll(){
        return customerRepository.getAll();
    }

    public Customer getCustomer(Long customerId) throws Exception {
        return customerRepository.getCustomer(customerId).orElseThrow(() -> new Exception("El cliente con el Id: " + customerId + " no se encuentra"));
    }

    public Optional<List<Customer>> getByDocument(String documentType, String documentNumber) {
        return customerRepository.getByDocument(documentType,documentNumber);
    }

    public Optional<List<Customer>> getByPhoneNumber(String phoneNumber){
        return customerRepository.getByPhoneNumber(phoneNumber);
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public boolean delete(Long customerId) throws Exception {
        Customer customer = getCustomer(customerId);
        if (customer != null) {
            customerRepository.delete(customerId);
            return true;
        }
        return false;
    }
}
