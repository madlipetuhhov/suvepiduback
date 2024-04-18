package ee.valiit.suvepiduback.summerevent.mainevent;

import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class MainEventController {
    private final MainEventService mainEventService;

    @PostMapping("/event/main")
    @Operation(summary = "Uue sündmuse lisamine. Tagastab mainEventId ",
            description = "Süsteemi lisatakse uus sündmus koos title, description ja imageData'ga.")
    public Integer addNewMainEvent(@RequestBody MainEventInfo mainEventInfo) {
       return mainEventService.addNewMainEvent(mainEventInfo);
    }






}
