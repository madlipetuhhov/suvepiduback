package ee.valiit.suvepiduback.summerevent.eventfeature;

import ee.valiit.suvepiduback.summerevent.eventfeature.dto.EventFeatureInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EventFeatureController {
   private final EventFeatureService eventFeatureService;
    @PostMapping("/event/feature/{mainEventId}")
    @Operation(summary = "Uuele sündmusele võimaluste lisamine. Tagastab mainEventId??. ",
            description = "Süsteemi lisatakse sündmusele juurde võimalused mainEventId abil.")
    public void addNewFeature(@RequestBody EventFeatureInfo eventFeatureInfo) {
        eventFeatureService.addNewFeature(eventFeatureInfo);
    }

}
