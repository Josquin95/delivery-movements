package co.com.doveracing.deliverymovements.persistence.mapper;

import co.com.doveracing.deliverymovements.domain.Employee;
import co.com.doveracing.deliverymovements.persistence.entity.EmployeeEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    @Mappings({
            @Mapping(source = "idEmployee", target = "employeeId"),
            @Mapping(source = "documentType", target = "documentType"),
            @Mapping(source = "documentNumber", target = "documentNumber"),
            @Mapping(source = "employeeAbb", target = "employeeAbb"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "middleName", target = "middleName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "phoneNumber", target = "phoneNumber"),
            @Mapping(source = "address", target = "address"),
            @Mapping(source = "bloodType", target = "bloodType"),
            @Mapping(source = "emergencyName", target = "emergencyName"),
            @Mapping(source = "emergencyContact", target = "emergencyContact"),
            @Mapping(source = "eps", target = "eps"),
            @Mapping(source = "createAt", target = "createAt"),
    })
    Employee toEmployee(EmployeeEntity employeeEntity);
    List<Employee> toEmployees(List<EmployeeEntity> employeeEntityList);

    @InheritInverseConfiguration
    @Mapping(target = "movementEntityList", ignore = true)
    EmployeeEntity toEmployeeEntity(Employee employee);
}
