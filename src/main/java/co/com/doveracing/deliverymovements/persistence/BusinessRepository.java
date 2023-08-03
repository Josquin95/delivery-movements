package co.com.doveracing.deliverymovements.persistence;

import co.com.doveracing.deliverymovements.domain.Business;
import co.com.doveracing.deliverymovements.domain.repository.IBusinessRepository;
import co.com.doveracing.deliverymovements.persistence.crud.IBusinessCrudRepository;
import co.com.doveracing.deliverymovements.persistence.entity.BusinessEntity;
import co.com.doveracing.deliverymovements.persistence.mapper.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BusinessRepository implements IBusinessRepository {

    @Autowired
    private IBusinessCrudRepository businessCrud;


    @Autowired
    private BusinessMapper businessMapper;

    @Override
    public List<Business>getAll() {
        List<BusinessEntity> businessEntityList = (List<BusinessEntity>) businessCrud.findAll();
        return businessMapper.toBusiness(businessEntityList);
    }

        @Override
        public Optional<List<Business>> getByDocument(String documentType, String documentNumber){
            return businessCrud.findByDocumentTypeAndDocumentNumber(documentType, documentNumber)
                    .map(businessMapper::toBusiness);
        }

    @Override
    public Optional<List<Business>> getByRepPhoneNumber(String repPhoneNumber) {
        return businessCrud.findByRepPhoneNumber(repPhoneNumber)
                .map(businessMapper::toBusiness);
    }

    @Override
    public Optional<List<Business>> getByLocationsList(String locationsList) {
        return businessCrud.findByLocationsList(locationsList)
                .map(businessMapper::toBusiness);
    }

    @Override
    public Optional<Business> getBusiness(Long businessId) {
        return Optional.empty();
    }

    @Override
    public Business save(Business business) {
        BusinessEntity businessEntity = businessMapper.toBusinessEntity(business);
        return businessMapper.toBusiness(businessCrud.save(businessEntity));
    }

    @Override
    public void delete(Long businessId) { businessCrud.deleteById(businessId);

    }

}
