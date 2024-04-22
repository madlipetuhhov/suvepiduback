package ee.valiit.suvepiduback.summerevent.tickettype;

import ee.valiit.suvepiduback.summerevent.tickettype.dto.TicketTypeInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TicketTypeController {
    private final TicketTypeService ticketTypeService;
    @PostMapping("/event/ticket-types")
    @Operation(summary = "Uuele sündmusele piletitüüpide ja nende hindade lisamine. Tagastab mainEventId??. ",
            description = "Süsteemi lisatakse sündmusele juurde piletitüübid ja nende hinnad mainEventId abil.")
        public void addNewTicketTypes(@RequestParam Integer mainEventId, @RequestBody TicketTypeInfo ticketTypeInfo) {
        ticketTypeService.addNewTicketTypes(mainEventId, ticketTypeInfo);
    }

}
