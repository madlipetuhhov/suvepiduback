package ee.valiit.suvepiduback.summerevent.eventdetail;

import ee.valiit.suvepiduback.domain.event.eventdetail.EventDetail;
import ee.valiit.suvepiduback.domain.event.eventdetail.EventDetailMapper;
import ee.valiit.suvepiduback.domain.event.eventdetail.EventDetailRepository;
import ee.valiit.suvepiduback.domain.event.eventdetail.county.County;
import ee.valiit.suvepiduback.domain.event.eventdetail.county.CountyRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEvent;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventRepository;
import ee.valiit.suvepiduback.summerevent.eventdetail.dto.EventDetailInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EventDetailService {

    private final EventDetailRepository eventDetailRepository;
    private final MainEventRepository mainEventRepository;
    private final CountyRepository countyRepository;

    private final EventDetailMapper eventDetailMapper;

    public EventDetail addEventDetail(EventDetailInfo eventDetailInfo) {
        MainEvent mainEvent = mainEventRepository.getReferenceById(eventDetailInfo.getMainEventId());
        eventDetailInfo.setMainEventId(mainEvent.getId());
        County county = countyRepository.getReferenceById(eventDetailInfo.getCountyId());
        eventDetailInfo.setCountyId(county.getId());
        EventDetail eventDetail = eventDetailMapper.toEventDetail(eventDetailInfo);
        eventDetailRepository.save(eventDetail);

        return eventDetail;

        // todo: Enne kui hakkad mapperiga tekitama uut objekti eventDetail (entity)
        //  siis pead leidma ülesse sissetulnud foreing keyd kui entity objektid.
        //  Seda saad teha vastavate repositoryde abil

        // Siis kasutad eventDetailMapperit, et luua uus 'eventDetail' objekt. Seda objekti on hiljem vaja siis andmebaasi salvestad
        // Ära saad mäppida väljad: date,start_time,end_time,address,longitude,latitude
        // start_time,end_time mäppimiseks vaada pangast näidet src/main/java/ee/valiit/bank33back/domain/location/locationimage/LocationImageMapper.java
        // rida 7 ja rida12
        // väga tähtis on rida 7 osa imports = {StringConverter.class}

        // peale mäppimist pead keskenuduma väljade main_event_id,county_id täitmisele. Varasemalt on sul siinseks hetkeks need foregin key objektid ülesse leitud
       // pead need 'eventDetail' objektile külge panema
        // nyyd saad selle eventDetail objekti andmebaasi repository abil ära salvestadada
        // the end



    }
}
