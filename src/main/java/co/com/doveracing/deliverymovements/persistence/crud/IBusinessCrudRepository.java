package co.com.doveracing.deliverymovements.persistence.crud;

import co.com.doveracing.deliverymovements.domain.Business;
import co.com.doveracing.deliverymovements.persistence.entity.BusinessEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface IBusinessCrudRepository extends PagingAndSortingRepository<BusinessEntity,Long> {

    Optional<List<BusinessEntity>> findByDocumentTypeAndDocumentNumber(String documentType, String documentNumber);

    Optional<List<BusinessEntity>>findByRepPhoneNumber(String repPhoneNumber );

    Optional<List<BusinessEntity>>findByLocationsList(String locationsList);
}
