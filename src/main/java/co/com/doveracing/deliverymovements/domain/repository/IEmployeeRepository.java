package co.com.doveracing.deliverymovements.domain.repository;

import co.com.doveracing.deliverymovements.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeRepository {

    List<Employee> getAll();

    Optional<List<Employee>> getByDocument(String documentType, String documentNumber);

    Optional<List<Employee>> getByEmployeeAbb(String EmployeeAbb);

    Optional<Employee> getEmployee(Long EmployeeId);

    Employee save(Employee Employee);

    void delete(Long EmployeeId);
}
