package co.com.doveracing.deliverymovements.web.controller;

import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.Employee;
import co.com.doveracing.deliverymovements.domain.service.CustomerService;
import co.com.doveracing.deliverymovements.domain.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/employees", produces = "application/json; charset=UTF-8")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping()
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Long  id){
      return employeeService.getEmployee(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getByDocument(@RequestParam("documentType") String documentType, @RequestParam("documentNumber") String documentNumber){
        return employeeService.getByDocument(documentType,documentNumber)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return employeeService.delete(id);
    }
}
