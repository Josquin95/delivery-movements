package co.com.doveracing.deliverymovements.domain.repository;

import co.com.doveracing.deliverymovements.domain.DeliveryType;

import java.util.List;
import java.util.Optional;

public interface IDeliveryTypeRepository {

    List<DeliveryType> getAll();

    Optional<DeliveryType> getDeliveryType(Long deliveryTypeId);

    DeliveryType save(DeliveryType deliveryType);

    void delete(Long deliveryTypeId);
}
