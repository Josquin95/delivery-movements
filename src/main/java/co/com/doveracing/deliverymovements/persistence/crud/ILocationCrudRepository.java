package co.com.doveracing.deliverymovements.persistence.crud;

import co.com.doveracing.deliverymovements.persistence.entity.CustomerEntity;
import co.com.doveracing.deliverymovements.persistence.entity.LocationEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface ILocationCrudRepository extends PagingAndSortingRepository<LocationEntity,Long> {

}
