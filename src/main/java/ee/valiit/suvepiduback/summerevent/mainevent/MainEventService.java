package ee.valiit.suvepiduback.summerevent.mainevent;

import ee.valiit.suvepiduback.domain.account.business.Business;
import ee.valiit.suvepiduback.domain.account.business.BusinessRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEvent;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventMapper;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventRepository;
import ee.valiit.suvepiduback.summerevent.Status;
import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfo;
import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfoExtended;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MainEventService {

    private final MainEventRepository mainEventRepository;
    private final BusinessRepository businessRepository;

    private final MainEventMapper mainEventMapper;


    public Integer addNewMainEvent(MainEventInfo mainEventInfo) {
        Business business = businessRepository.getReferenceById(mainEventInfo.getBusinessId());
        MainEvent mainEvent = mainEventMapper.toMainEvent(mainEventInfo);
        mainEvent.setBusiness(business);
        mainEventRepository.save(mainEvent);
        return mainEvent.getId();
    }

    public MainEventInfoExtended getMainEvent(Integer mainEventId) {
        MainEvent mainEvent = mainEventRepository.findMainEventBy(mainEventId, Status.ACTIVE);
        return mainEventMapper.toMainEventInfo(mainEvent);
    }

    public List<MainEventInfoExtended> getMainEvents(Integer businessId) {
        List<MainEvent> mainEvents = mainEventRepository.findMainEventsBy(businessId, Status.ACTIVE);
        return mainEventMapper.toMainEventInfos(mainEvents);
    }


    public void updateMainEvent(MainEventInfoExtended mainEventInfoExtended) {
        MainEvent mainEvent = mainEventRepository.getReferenceById(mainEventInfoExtended.getMainEventId());
        mainEventMapper.editMainEvent(mainEventInfoExtended, mainEvent);
        mainEventRepository.save(mainEvent);
    }
}

