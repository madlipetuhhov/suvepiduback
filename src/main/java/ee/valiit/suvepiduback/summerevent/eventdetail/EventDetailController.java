package ee.valiit.suvepiduback.summerevent.eventdetail;

import ee.valiit.suvepiduback.domain.event.eventdetail.EventDetail;
import ee.valiit.suvepiduback.summerevent.eventdetail.dto.EventDetailInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EventDetailController {

    private final EventDetailService eventDetailService;

    @PostMapping("/event/detail/")
    @Operation(summary = "Uuele sündmusele detailide lisamine. Tagastab eventDetailId. ",
            description = "Süsteemi lisatakse sündmusele juurde detailid eventDetailId abil.")
    public Integer addEventDetail(@RequestParam Integer mainEventId, @RequestBody EventDetailInfo eventDetailInfo) {
       return eventDetailService.addEventDetail(mainEventId, eventDetailInfo);

    }

}
