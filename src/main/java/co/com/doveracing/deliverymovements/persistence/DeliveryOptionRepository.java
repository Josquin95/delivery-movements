package co.com.doveracing.deliverymovements.persistence;

import co.com.doveracing.deliverymovements.domain.DeliveryOption;
import co.com.doveracing.deliverymovements.domain.repository.IDeliveryOptionRepository;
import co.com.doveracing.deliverymovements.persistence.crud.IDeliveryOptionCrudRepository;
import co.com.doveracing.deliverymovements.persistence.entity.DeliveryOptionEntity;
import co.com.doveracing.deliverymovements.persistence.mapper.DeliveryOptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class DeliveryOptionRepository implements IDeliveryOptionRepository{

    @Autowired
    private IDeliveryOptionCrudRepository deliveryOptionCrud;

     @Autowired
    private DeliveryOptionMapper deliveryOptionMapper;


    @Override
    public List<DeliveryOption> getAll() {
        return null;
    }

    @Override
    public Optional<DeliveryOption> getDeliveryOption(Long deliveryOptionId) {
        return Optional.empty();
    }

    @Override
    public DeliveryOption save(DeliveryOption deliveryOption) {
        return null;
    }

    @Override
    public void delete(Long DeliveryOptionId) {

    }
}
