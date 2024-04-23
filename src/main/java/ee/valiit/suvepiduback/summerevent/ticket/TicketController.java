package ee.valiit.suvepiduback.summerevent.ticket;

import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
    public void addNewTicket(@RequestBody EventTicketInfo eventTicketInfo) {
        ticketService.addNewTicket(eventTicketInfo);
    }

    @GetMapping("/event/ticket")
    @Operation(summary = "Piletiinfo toomine andmebaasist",
            description = "Andmebaasist tuuakse ühe pileti info EventTicketId abil, kui selle staatus on aktiivne.")
    public void getEventTicket() {
        ticketService.getEventTicket();
    }

}
