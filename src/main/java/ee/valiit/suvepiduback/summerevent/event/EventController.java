package ee.valiit.suvepiduback.summerevent.event;

import ee.valiit.suvepiduback.summerevent.event.dto.MainEventInfo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EventController {
    private final EventService eventService;

    @PostMapping("/event/main")
    @Operation(summary = "Uue sündmuse lisamine.",
            description = "Süsteemi lisatakse uus sündmus koos title, description ja imageData'ga.")
    public void addNewMainEvent(@RequestBody @Valid MainEventInfo mainEventInfo) {
        eventService.addNewMainEvent(mainEventInfo);
    }


}
