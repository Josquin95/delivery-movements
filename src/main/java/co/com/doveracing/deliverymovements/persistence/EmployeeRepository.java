package co.com.doveracing.deliverymovements.persistence;

import co.com.doveracing.deliverymovements.domain.Employee;
import co.com.doveracing.deliverymovements.domain.repository.IEmployeeRepository;
import co.com.doveracing.deliverymovements.persistence.crud.IEmployeeCrudRepository;
import co.com.doveracing.deliverymovements.persistence.entity.EmployeeEntity;
import co.com.doveracing.deliverymovements.persistence.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository implements IEmployeeRepository {
    @Autowired
    private IEmployeeCrudRepository employeeCrud;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAll() {
        List<EmployeeEntity> employeeEntityList = (List<EmployeeEntity>) employeeCrud.findAll();
        return employeeMapper.toEmployees(employeeEntityList);
    }

    @Override
    public Optional<List<Employee>> getByDocument(String documentType, String documentNumber) {
        return employeeCrud.findByDocumentTypeAndDocumentNumber(documentType, documentNumber)
                .map(employeeMapper::toEmployees);
    }

    @Override
    public Optional<List<Employee>> getByEmployeeAbb(String customerAbb) {
        return employeeCrud.findByEmployeeAbb(customerAbb)
                .map(employeeMapper::toEmployees);
    }

    @Override
    public Optional<Employee> getEmployee(Long idCustomer) {
        return employeeCrud.findById(idCustomer).map(employeeMapper::toEmployee);
    }

    @Override
    public void delete(Long customerId) {
        employeeCrud.deleteById(customerId);
    }

    @Override
    public Employee save(Employee employee) {
        EmployeeEntity employeeEntity = employeeMapper.toEmployeeEntity(employee);
        return employeeMapper.toEmployee(employeeCrud.save(employeeEntity));
    }

}
