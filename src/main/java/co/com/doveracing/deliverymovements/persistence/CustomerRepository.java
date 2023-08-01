package co.com.doveracing.deliverymovements.persistence;

import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.repository.ICustomerRepository;
import co.com.doveracing.deliverymovements.persistence.crud.ICustomerCrudRepository;
import co.com.doveracing.deliverymovements.persistence.entity.CustomerEntity;
import co.com.doveracing.deliverymovements.persistence.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepository implements ICustomerRepository {
    @Autowired
    private ICustomerCrudRepository customerCrud;

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> getAll() {
        List<CustomerEntity> customerEntityList = (List<CustomerEntity>) customerCrud.findAll();
        return customerMapper.toCustomers(customerEntityList);
    }

    @Override
    public Optional<List<Customer>> getByDocument(String documentType, String documentNumber) {
        return customerCrud.findByDocumentTypeAndDocumentNumber(documentType, documentNumber)
                .map(customerMapper::toCustomers);
    }

    @Override
    public Optional<List<Customer>> getByPhoneNumber(String phoneNumber) {
        return customerCrud.findByPhoneNumber(phoneNumber)
                .map(customerMapper::toCustomers);
    }

    @Override
    public Optional<Customer> getCustomer(Long idCustomer) {
        return customerCrud.findById(idCustomer).map(customerMapper::toCustomer);
    }

    @Override
    public void delete(Long customerId) {
        customerCrud.deleteById(customerId);
    }

    @Override
    public Customer save(Customer customer) {
        CustomerEntity customerEntity = customerMapper.toCustomerEntity(customer);
        return customerMapper.toCustomer(customerCrud.save(customerEntity));
    }

}
