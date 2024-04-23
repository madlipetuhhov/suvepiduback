package ee.valiit.suvepiduback.summerevent.ticket;

import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController

public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/event/tickets")
    @Operation(summary = "Uuele sündmusele piletikoguse ja saadavuse lisamine. Tagastab eventTicketId??. ",
            description = "Süsteemi lisatakse sündmusele juurde piletikogused ja saadavused.")
    public void addNewTicketAmountAndAvailability(@RequestBody EventTicketInfo eventTicketInfo) {
        ticketService.addNewTicketAmountAndAvailability(eventTicketInfo);
    }
}
