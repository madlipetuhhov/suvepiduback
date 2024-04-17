package ee.valiit.suvepiduback.summerevent.event;

import ee.valiit.suvepiduback.domain.account.business.Business;
import ee.valiit.suvepiduback.domain.account.business.BusinessRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEvent;
import ee.valiit.suvepiduback.summerevent.event.dto.MainEventInfo;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventMapper;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventService {

    private final MainEventRepository mainEventRepository;
    private final BusinessRepository businessRepository;

    private final MainEventMapper mainEventMapper;


    public void addNewMainEvent(MainEventInfo mainEventInfo) {
        // otsi businessId abil ylesse business objekt
        Business business = businessRepository.getReferenceById(mainEventInfo.getBusinessId());
        MainEvent mainEvent = mainEventMapper.toMainEvent(mainEventInfo);
        // pane mainEvnitle business kylge
        mainEvent.setBusiness(business);
        mainEventRepository.save(mainEvent);
    }
}
