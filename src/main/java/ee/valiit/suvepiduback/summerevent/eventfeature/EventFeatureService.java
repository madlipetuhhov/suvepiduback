package ee.valiit.suvepiduback.summerevent.eventfeature;

import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeature;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeatureMapper;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeatureRepository;
import ee.valiit.suvepiduback.summerevent.eventfeature.dto.EventFeatureInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventFeatureService {
    private final EventFeatureRepository eventFeatureRepository;
    private final EventFeatureMapper eventFeatureMapper;

    public void addNewFeature(EventFeatureInfo eventFeatureInfo) {
        EventFeature eventFeature = eventFeatureMapper.toEventFeature(eventFeatureInfo);
        eventFeatureRepository.save(eventFeature);
    }
}
