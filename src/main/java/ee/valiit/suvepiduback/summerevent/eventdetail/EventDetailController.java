package ee.valiit.suvepiduback.summerevent.eventdetail;

import ee.valiit.suvepiduback.summerevent.eventdetail.dto.EventDetailInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class EventDetailController {

    private final EventDetailService eventDetailService;

    @PostMapping("/event/detail/")
    @Operation(summary = "Uuele sündmusesarjale detailide lisamine. Tagastab eventDetailId. ",
            description = "Süsteemi lisatakse sündmusele juurde detailid eventDetailId abil.")
    public Integer addEventDetail(@RequestParam Integer mainEventId, @RequestBody EventDetailInfo eventDetailInfo) {
        return eventDetailService.addEventDetail(mainEventId, eventDetailInfo);

    }

    @GetMapping("/event/details/")
    @Operation(summary = "Sündmuste listi toomine andmebaasist vastavalt mainEventId-le",
            description = "Andmebaasist tuuakse vastava ürituse sarja kõik toimumiskohad (detailid) mainEventId abil")
    public List<EventDetailInfo> getEventDetails(@RequestParam Integer mainEventId) {
        eventDetailService.getEventDetails(mainEventId);
        return eventDetailService.getEventDetails(mainEventId);

    }

}
