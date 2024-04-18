package ee.valiit.suvepiduback.summerevent.feature;

import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.feature.Feature;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.feature.FeatureMapper;
import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.feature.FeatureRepository;
import ee.valiit.suvepiduback.summerevent.feature.dto.FeatureInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FeatureService {
    private final FeatureRepository featureRepository;
    private final FeatureMapper featureMapper;

    public List<FeatureInfo> executeFeaturesList() {
        List<Feature> features = featureRepository.findAll();
//        kuidas saada list tähestikku, query-ga ei saanud tööle

        return featureMapper.toFeatureInfos(features);
    }
}
