package co.com.doveracing.deliverymovements.persistence.mapper;

import co.com.doveracing.deliverymovements.domain.Business;
import co.com.doveracing.deliverymovements.persistence.entity.BusinessEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BusinessMapper {

    @Mappings({
            @Mapping(source = "idBusiness", target ="idBusiness"),
            @Mapping(source = "legalName", target ="legalName"),
            @Mapping(source = "commercialName", target ="commercialName"),
            @Mapping(source = "representativeName", target ="representativeName"),
            @Mapping(source = "documentType", target ="documentType"),
            @Mapping(source = "documentNumber", target ="documentNumber"),
            @Mapping(source = "email", target ="email"),
            @Mapping(source = "repPhoneNumber", target ="repPhoneNumber"),
            @Mapping(source = "createAt", target ="createAt"),
    })
    Business toBusiness(BusinessEntity businessEntity);
    List<Business> toBusiness(List<BusinessEntity> businessEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "locationsList", ignore = true)
    BusinessEntity toBusinessEntity(Business business);

}
