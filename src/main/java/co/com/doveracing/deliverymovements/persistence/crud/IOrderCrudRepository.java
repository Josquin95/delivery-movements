package co.com.doveracing.deliverymovements.persistence.crud;

import co.com.doveracing.deliverymovements.persistence.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderCrudRepository extends JpaRepository<OrderEntity, Long> {
}