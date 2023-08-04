package co.com.doveracing.deliverymovements.web.controller;

import co.com.doveracing.deliverymovements.domain.Business;
import co.com.doveracing.deliverymovements.domain.Customer;
import co.com.doveracing.deliverymovements.domain.DeliveryOption;
import co.com.doveracing.deliverymovements.domain.service.DeliveryOptionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path = "/services", produces = "application/json; charset=UTF-8")
@Slf4j
public class DeliveryOptionController {

   @Autowired
   private DeliveryOptionService deliveryOptionService;

   @GetMapping()
    public ResponseEntity<List<DeliveryOption>> getAll(){return ResponseEntity.ok(deliveryOptionService.getAll());}
    @GetMapping("/{id}")
    public ResponseEntity<DeliveryOption> getDeliveryOption(@PathVariable("id") Long  id){
        return deliveryOptionService.getDeliveryOption(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/filter")
    public ResponseEntity<List<DeliveryOption>> getByOptionType(@RequestParam("optionType") String optionType){
        return deliveryOptionService.getByTypeOption(optionType)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping()
    public DeliveryOption save(@RequestBody DeliveryOption deliveryOption){
        return deliveryOptionService.save(deliveryOption);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Long id){
        return deliveryOptionService.delete(id);
    }
}
