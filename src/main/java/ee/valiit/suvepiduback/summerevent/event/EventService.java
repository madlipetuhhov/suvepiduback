package ee.valiit.suvepiduback.summerevent.event;

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
private final MainEventMapper mainEventMapper;


    public void addNewMainEvent(MainEventInfo mainEventInfo) {
        // otsi businessId abil ylesse business objekt
        MainEvent mainEvent = mainEventMapper.toMainEvent(mainEventInfo);
        // pane mainEvnitle business kylge
        mainEventRepository.save(mainEvent);
    }
}
