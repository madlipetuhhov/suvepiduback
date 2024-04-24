package ee.valiit.suvepiduback.summerevent.ticket;

import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketInfo;
import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketRequest;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController

public class TicketController {
    private final TicketService ticketService;

    @PostMapping("/event/ticket")
    @Operation(summary = "Uuele sündmusele piletikoguse ja saadavuse lisamine. Tagastab eventTicketId??. ",
            description = "Süsteemi lisatakse sündmusele juurde piletikogused ja saadavused.")
    public void addNewTicket(@RequestBody EventTicketRequest eventTicketInfo) {
        ticketService.addNewTicket(eventTicketInfo);
    }

    @GetMapping("/event/tickets")
    @Operation(summary = "Kõikide piletite toomine andmebaasist",
            description = "Andmebaasist tuuakse kõik piletid eventDetailId abil, kui selle staatus on aktiivne.")
    public List<EventTicketInfo> getEventTickets(@RequestParam Integer eventDetailId) {
        return ticketService.getEventTickets(eventDetailId);
    }

}
