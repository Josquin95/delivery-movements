package co.com.doveracing.deliverymovements.domain.repository;

import co.com.doveracing.deliverymovements.domain.DeliveryOption;

import java.util.List;
import java.util.Optional;

public interface IDeliveryOptionRepository {
    List<DeliveryOption> getAll();

    Optional<DeliveryOption>getDeliveryOption(Long deliveryOptionId);

    DeliveryOption save(DeliveryOption deliveryOption);

    Optional<List<DeliveryOption>> getByTypeOption(String typeOption);

    void delete(Long deliveryOption);
}
