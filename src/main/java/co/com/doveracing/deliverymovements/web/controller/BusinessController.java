package co.com.doveracing.deliverymovements.web.controller;

import co.com.doveracing.deliverymovements.domain.Business;
import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.service.BusinessService;
import co.com.doveracing.deliverymovements.domain.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/business", produces = "application/json; charset=UTF-8")
@Slf4j
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @GetMapping()
    public ResponseEntity<List<Business>> getAll(){
        return ResponseEntity.ok(businessService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Business> getBusiness(@PathVariable("id") Long id){
     return businessService.getBusiness(id)
            .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/business")
    public ResponseEntity<List<Business>> getByDocument(@RequestParam("documentType") String documentType, @RequestParam("documentNumber") String documentNumber){
        return businessService.getByDocument(documentType,documentNumber)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping()
    public Business save(@RequestBody Business business){
        return businessService.save(business);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return businessService.delete(id);
    }


}
