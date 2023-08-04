package co.com.doveracing.deliverymovements.web.controller;

import co.com.doveracing.deliverymovements.domain.ApiResponse;
import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.DataHeader;
import co.com.doveracing.deliverymovements.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<ApiResponse<?>> getCustomer(@PathVariable("id") Long  id){
        try {
            Customer customer = customerService.getCustomer(id);
            ApiResponse<Customer> response = new ApiResponse<>();
            DataHeader dataHeader = new DataHeader();
            dataHeader.setMensaje("Cliente obtenido correctamente");
            response.setDataHeader(dataHeader);
            response.setData(customer);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            ApiResponse<Object> errorResponse = new ApiResponse<>();
            DataHeader dataHeader = new DataHeader();
            dataHeader.setError(ex.getMessage());
            errorResponse.setDataHeader(dataHeader);
            errorResponse.setData(null);
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/filter")
    public ResponseEntity<List<Customer>> getByDocument(@RequestParam("documentType") String documentType, @RequestParam("documentNumber") String documentNumber){
        return customerService.getByDocument(documentType,documentNumber)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> delete(@PathVariable("id") Long id){
        try {
            customerService.delete(id);
            ApiResponse<Customer> response = new ApiResponse<>();
            DataHeader dataHeader = new DataHeader();
            dataHeader.setMensaje("Cliente eliminado correctamente");
            response.setDataHeader(dataHeader);
            response.setData(null);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception ex) {
            ApiResponse<Object> errorResponse = new ApiResponse<>();
            DataHeader dataHeader = new DataHeader();
            dataHeader.setError(ex.getMessage());
            errorResponse.setDataHeader(dataHeader);
            errorResponse.setData(null);
            return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
        }
    }
}
