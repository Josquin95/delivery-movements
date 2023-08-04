package co.com.doveracing.deliverymovements.persistence.crud;
import co.com.doveracing.deliverymovements.persistence.entity.DeliveryOptionEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface IDeliveryOptionCrudRepository extends  PagingAndSortingRepository<DeliveryOptionEntity,Long>{

    Optional<List<DeliveryOptionEntity>> findByTypeOption(String typeOption);

}
