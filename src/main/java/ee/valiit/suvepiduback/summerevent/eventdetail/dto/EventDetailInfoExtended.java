package ee.valiit.suvepiduback.summerevent.eventdetail.dto;

import ee.valiit.suvepiduback.domain.event.eventdetail.county.County;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link County}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDetailInfoExtended extends EventDetailInfo implements Serializable {
    private String countyName;
}