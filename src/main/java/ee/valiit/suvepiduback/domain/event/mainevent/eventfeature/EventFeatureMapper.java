package ee.valiit.suvepiduback.domain.event.mainevent.eventfeature;

import ee.valiit.suvepiduback.summerevent.eventfeature.dto.EventFeatureInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventFeatureMapper {

    @Mapping(source = "featureId", target = "feature.id")
    @Mapping(source = "mainEventId", target = "mainEvent.id")
    EventFeature toEventFeature(EventFeatureInfo eventFeatureInfo);

}