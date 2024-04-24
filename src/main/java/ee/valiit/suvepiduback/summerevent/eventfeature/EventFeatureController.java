package ee.valiit.suvepiduback.summerevent.eventfeature;

import ee.valiit.suvepiduback.summerevent.feature.dto.FeatureInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
