package ee.valiit.suvepiduback.domain.ticket.eventticket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventTicketRepository extends JpaRepository<EventTicket, Integer> {
}