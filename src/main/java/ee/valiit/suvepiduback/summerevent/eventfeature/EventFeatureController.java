package ee.valiit.suvepiduback.summerevent.eventfeature;

import ee.valiit.suvepiduback.summerevent.eventfeature.dto.EventFeatureInfo;
import ee.valiit.suvepiduback.summerevent.feature.dto.FeatureInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class EventFeatureController {
    private final EventFeatureService eventFeatureService;

    @PostMapping("/event/features")
    @Operation(summary = "Uuele sündmusele võimaluste lisamine. Tagastab mainEventId. ",
            description = "Süsteemi lisatakse sündmusele juurde võimalused mainEventId abil.")
    public void addNewFeatures(@RequestParam Integer mainEventId, @RequestBody List<FeatureInfo> featureInfos) {
        eventFeatureService.addNewFeatures(mainEventId,featureInfos);
    }

    @GetMapping("/event/features")
    @Operation(summary = "Kõikide valitud võimaluste andmebaasist toomine vastava sündmuse kohta.",
            description = "Andmebaasist tuuakse vastava sündmuse kõik võimalused mainEventId abil.")
    public List<EventFeatureInfo> getEventFeatures(@RequestParam Integer mainEventId) {
        return eventFeatureService.getEventFeatures(mainEventId);
    }

}
