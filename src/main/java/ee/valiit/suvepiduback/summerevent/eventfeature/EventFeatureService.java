package ee.valiit.suvepiduback.summerevent.eventfeature;

import ee.valiit.suvepiduback.domain.event.mainevent.MainEvent;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeature;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeatureRepository;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.feature.Feature;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.feature.FeatureRepository;
import ee.valiit.suvepiduback.summerevent.feature.dto.FeatureInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EventFeatureService {
    private final EventFeatureRepository eventFeatureRepository;
    private final MainEventRepository mainEventRepository;
    private final FeatureRepository featureRepository;

    public void addNewFeatures(Integer mainEventId, List<FeatureInfo> featureInfos) {
        MainEvent mainEvent = mainEventRepository.getReferenceById(mainEventId);
        createAndSaveEventFeatures(mainEvent, featureInfos);
    }

    private void createAndSaveEventFeatures(MainEvent mainEvent, List<FeatureInfo> featureInfos) {
        List<EventFeature> eventFeatures = createEventFeatures(mainEvent, featureInfos);
        eventFeatureRepository.saveAll(eventFeatures);
    }

    private List<EventFeature> createEventFeatures(MainEvent mainEvent, List<FeatureInfo> featureInfos) {
        List<EventFeature> eventFeatures = new ArrayList<>();
        for (FeatureInfo featureInfo : featureInfos) {
            if (featureInfo.getIsAvailable()) {
                Feature feature = featureRepository.getReferenceById(featureInfo.getFeatureId());
                EventFeature eventFeature = new EventFeature();
                eventFeature.setMainEvent(mainEvent);
                eventFeature.setFeature(feature);
                eventFeatures.add(eventFeature);
            }
        }
        return eventFeatures;
    }


}

