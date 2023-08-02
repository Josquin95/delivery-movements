package co.com.doveracing.deliverymovements.domain.service;

import co.com.doveracing.deliverymovements.domain.DeliveryOption;
import co.com.doveracing.deliverymovements.domain.repository.IDeliveryOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;



@Service
public class DeliveryOptionService {

    @Autowired
    private IDeliveryOptionRepository deliveryOptionRepository;

    public List<DeliveryOption> getAll() {
        return deliveryOptionRepository.getAll();
    }

    public Optional<DeliveryOption> getDeliveryOption(Long deliveryOptionId){
        return deliveryOptionRepository.getDeliveryOption(deliveryOptionId);
    }

    public DeliveryOption save(DeliveryOption deliveryOption) {
        return deliveryOptionRepository.save(deliveryOption);
    }

    public boolean delete(Long deliveryOptionId) {

        return getDeliveryOption(deliveryOptionId).map(deliveryOption -> {
            deliveryOptionRepository.delete(deliveryOptionId);
            return true;
        }).orElse( false );

    }



}


