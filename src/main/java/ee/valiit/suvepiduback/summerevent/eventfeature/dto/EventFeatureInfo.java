package ee.valiit.suvepiduback.summerevent.eventfeature.dto;

import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeature;
import ee.valiit.suvepiduback.summerevent.feature.dto.FeatureInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link EventFeature}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventFeatureInfo implements Serializable {
    private Integer mainEventId;
    private Integer featureId;
}