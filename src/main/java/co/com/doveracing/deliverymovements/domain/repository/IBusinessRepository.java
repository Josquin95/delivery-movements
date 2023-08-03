package co.com.doveracing.deliverymovements.domain.repository;

import co.com.doveracing.deliverymovements.domain.Business;

import java.util.List;
import java.util.Optional;

public interface IBusinessRepository {

    List<Business> getAll();

    Optional<List<Business>> getByDocument(String documentType, String documentNumber);

    Optional<List<Business>> getByRepPhoneNumber(String repPhoneNumber );

    Optional<List<Business>> getByLocationsList (String locationsList);

    Optional <Business> getBusiness (Long businessId);

    Business save(Business business);

    void delete(Long businessId);


}
