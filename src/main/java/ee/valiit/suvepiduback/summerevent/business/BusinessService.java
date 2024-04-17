package ee.valiit.suvepiduback.summerevent.business;

import ee.valiit.suvepiduback.domain.account.business.BusinessMapper;
import ee.valiit.suvepiduback.domain.account.business.BusinessRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BusinessService {

    private final BusinessRepository businessRepository;
    private final BusinessMapper businessMapper;
    public void executeBusinessesDropdown() {
        businessRepository.findAll();
    }
}
