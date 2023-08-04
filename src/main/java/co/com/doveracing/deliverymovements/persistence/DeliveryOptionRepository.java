package co.com.doveracing.deliverymovements.persistence;

import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.DeliveryOption;
import co.com.doveracing.deliverymovements.domain.repository.IDeliveryOptionRepository;
import co.com.doveracing.deliverymovements.persistence.crud.IDeliveryOptionCrudRepository;
import co.com.doveracing.deliverymovements.persistence.entity.CustomerEntity;
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
        List<DeliveryOptionEntity> deliveryOptionEntityList = (List<DeliveryOptionEntity>) deliveryOptionCrud.findAll();
        return deliveryOptionMapper.toDeliveryOptions(deliveryOptionEntityList);
    }
    @Override
    public Optional<DeliveryOption> getDeliveryOption(Long idDeliveryOption) {
        return deliveryOptionCrud.findById(idDeliveryOption).map(deliveryOptionMapper::toDeliveryOption);
    }

    @Override
    public void delete(Long idDeliveryOption) {
        deliveryOptionCrud.deleteById(idDeliveryOption);
    }

    @Override
    public DeliveryOption save( DeliveryOption deliveryOption) {
        DeliveryOptionEntity deliveryOptionEntity = deliveryOptionMapper.toDeliveryOptionEntity(deliveryOption);
        return deliveryOptionMapper.toDeliveryOption(deliveryOptionCrud.save(deliveryOptionEntity));
    }

    @Override
    public Optional<List<DeliveryOption>> getByTypeOption(String typeOption) {
        return deliveryOptionCrud.findByTypeOption(typeOption).map(deliveryOptionMapper::toDeliveryOptions);
    }


}



