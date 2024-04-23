package ee.valiit.suvepiduback.summerevent.ticket;

import ee.valiit.suvepiduback.domain.event.eventdetail.EventDetail;
import ee.valiit.suvepiduback.domain.event.eventdetail.EventDetailRepository;
import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicket;
import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicketMapper;
import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicketRepository;
import ee.valiit.suvepiduback.domain.ticket.tickettype.TicketType;
import ee.valiit.suvepiduback.domain.ticket.tickettype.TicketTypeRepository;
import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class TicketService {

    private final EventDetailRepository eventDetailRepository;
    private final TicketTypeRepository ticketTypeRepository;
    private final EventTicketRepository eventTicketRepository;
    private final EventTicketMapper eventTicketMapper;

    public void addNewTicket(EventTicketInfo eventTicketInfo) {

        EventDetail eventDetail = eventDetailRepository.getReferenceById(eventTicketInfo.getEventDetailId());
        TicketType ticketType = ticketTypeRepository.getReferenceById(eventTicketInfo.getTicketTypeId());
        EventTicket eventTicket = eventTicketMapper.toEventTicket(eventTicketInfo);
        eventTicket.setEventDetail(eventDetail);
        eventTicket.setTicketType(ticketType);
        eventTicketRepository.save(eventTicket);

        //Vbla läheb eventTicketId'd tarvis
        //return eventTicket.getId();

    }

    public void getEventTicket() {

    }
}
