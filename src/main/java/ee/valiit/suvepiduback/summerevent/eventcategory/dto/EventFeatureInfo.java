package ee.valiit.suvepiduback.summerevent.eventcategory.dto;

import ee.valiit.suvepiduback.domain.event.mainevent.eventfeature.EventFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

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