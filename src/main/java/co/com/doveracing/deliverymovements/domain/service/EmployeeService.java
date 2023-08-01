package co.com.doveracing.deliverymovements.domain.service;

import co.com.doveracing.deliverymovements.domain.Employee;
import co.com.doveracing.deliverymovements.domain.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.getAll();
    }

    public Optional<Employee> getEmployee(Long employeeId){
        return employeeRepository.getEmployee(employeeId);
    }

    public Optional<List<Employee>> getByDocument(String documentType, String documentNumber) {
        return employeeRepository.getByDocument(documentType,documentNumber);
    }

    public Optional<List<Employee>> getByEmployeeAbb(String employeeAbb){
        return employeeRepository.getByEmployeeAbb(employeeAbb);
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public boolean delete(Long employeeId){
        return getEmployee(employeeId).map(employee -> {
            employeeRepository.delete(employeeId);
            return true;
        }).orElse(false);
    }
}
