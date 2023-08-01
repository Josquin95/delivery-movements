package co.com.doveracing.deliverymovements.persistence.crud;

import co.com.doveracing.deliverymovements.persistence.entity.DeliveryOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeliveryOptionCrudRepository extends JpaRepository<DeliveryOptionEntity, Long> {
}
