package ee.valiit.suvepiduback.summerevent.ticket;

import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicket;
import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicketMapper;
import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicketRepository;
import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class TicketService {

    private final EventTicketRepository eventTicketRepository;
    private final EventTicketMapper eventTicketMapper;

    public void addNewTicketAmountAndAvailability(EventTicketInfo eventTicketInfo) {

        createAndSaveTicket(eventTicketInfo);
    }

    private EventTicket createAndSaveTicket(EventTicketInfo eventTicketInfo) {
        EventTicket eventTicket = eventTicketMapper.toEventTicket(eventTicketInfo);
        eventTicketRepository.save(eventTicket);
        return eventTicket;
    }
}
