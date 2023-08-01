package co.com.doveracing.deliverymovements.persistence.mapper;

import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.persistence.entity.CustomerEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "idCustomer", target = "customerId"),
            @Mapping(source = "documentType", target = "documentType"),
            @Mapping(source = "documentNumber", target = "documentNumber"),
            @Mapping(source = "fullName", target = "fullName"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "obsAddress", target = "obsAddress"),
            @Mapping(source = "city", target = "city"),
            @Mapping(source = "latitude", target = "latitude"),
            @Mapping(source = "longitude", target = "longitude"),
            @Mapping(source = "paymentMethod", target = "paymentMethod"),
            @Mapping(source = "createAt", target = "createAt")

    })
    Customer toCustomer(CustomerEntity customerEntity);
    List<Customer> toCustomers(List<CustomerEntity> customerEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "orderList", ignore = true)
    CustomerEntity toCustomerEntity(Customer customer);
}
