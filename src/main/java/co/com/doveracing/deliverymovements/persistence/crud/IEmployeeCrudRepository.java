package co.com.doveracing.deliverymovements.persistence.crud;

import co.com.doveracing.deliverymovements.persistence.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface IEmployeeCrudRepository extends PagingAndSortingRepository<EmployeeEntity, Long>, JpaSpecificationExecutor<EmployeeEntity> {

    Optional<List<EmployeeEntity>> findByDocumentTypeAndDocumentNumber(String documentType, String documentNumber);

    Optional<List<EmployeeEntity>> findByEmployeeAbb(String employeeAbb);
}