package co.com.doveracing.deliverymovements.web.controller;

import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/customers", produces = "application/json; charset=UTF-8")
@Slf4j
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping()
    public ResponseEntity<List<Customer>> getAll(){
        return ResponseEntity.ok(customerService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long  id){
      return customerService.getCustomer(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getByDocument(@RequestParam("documentType") String documentType, @RequestParam("documentNumber") String documentNumber){
        return customerService.getByDocument(documentType,documentNumber)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return customerService.delete(id);
    }
}
