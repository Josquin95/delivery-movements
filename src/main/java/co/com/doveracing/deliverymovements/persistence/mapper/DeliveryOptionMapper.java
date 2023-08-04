package co.com.doveracing.deliverymovements.persistence.mapper;

import co.com.doveracing.deliverymovements.domain.DeliveryOption;
import co.com.doveracing.deliverymovements.persistence.entity.DeliveryOptionEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeliveryOptionMapper {

    @Mappings({
            @Mapping(source = "idDeliveryOption", target = "idDeliveryOption"),
            @Mapping(source = "nameOption", target = "nameOption"),
            @Mapping(source = "descOption", target = "descOption"),
            @Mapping(source = "typeOption", target = "typeOption"),
            @Mapping(source = "stateOption", target = "stateOption"),
            @Mapping(source = "initRange", target = "initRange"),
            @Mapping(source = "finalRange", target = "finalRange"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "createAt", target = "createAt")
    })
    DeliveryOption toDeliveryOption(DeliveryOptionEntity deliveryOptionEntity);
    List <DeliveryOption> toDeliveryOptions(List<DeliveryOptionEntity> deliveryOptionEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "orderList", ignore = true)
    DeliveryOptionEntity toDeliveryOptionEntity(DeliveryOption deliveryOption);
}
