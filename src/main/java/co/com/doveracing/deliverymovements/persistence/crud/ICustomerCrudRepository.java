package co.com.doveracing.deliverymovements.persistence.crud;

import co.com.doveracing.deliverymovements.persistence.entity.CustomerEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ICustomerCrudRepository extends PagingAndSortingRepository<CustomerEntity,Long> {

    Optional<List<CustomerEntity>> findByDocumentTypeAndDocumentNumber(String documentType, String documentNumber);

    Optional<List<CustomerEntity>> findByPhoneNumber(String phoneNumber);
}
