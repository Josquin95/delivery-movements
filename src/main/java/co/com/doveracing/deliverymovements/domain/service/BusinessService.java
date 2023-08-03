package co.com.doveracing.deliverymovements.domain.service;

import co.com.doveracing.deliverymovements.domain.Business;
import co.com.doveracing.deliverymovements.domain.repository.IBusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService {

    @Autowired
    private IBusinessRepository businessRepository;

    public List<Business> getAll(){return businessRepository.getAll();}

    public Optional<Business> getBusiness(Long businessId){return businessRepository.getBusiness(businessId); }

    public Optional<List<Business>> getByDocument(String documentType, String documentNumber) {
        return businessRepository.getByDocument(documentType,documentNumber);
    }
    public Optional<List<Business>> getByRepPhoneNumber(String repPhoneNumber ){return businessRepository.getByRepPhoneNumber(repPhoneNumber);}

    public Optional<List<Business>>getByLocationsList(String locationsList){return businessRepository.getByLocationsList( locationsList);}

    public Business save(Business business){return businessRepository.save(business);}

    public boolean delete(Long businessId){
        return getBusiness(businessId).map(business -> {
            businessRepository.delete(businessId);
            return true;
        }).orElse(false);
    }


}

