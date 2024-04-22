package ee.valiit.suvepiduback.summerevent.ticket.dto;

import ee.valiit.suvepiduback.domain.ticket.eventticket.EventTicket;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link EventTicket}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketAmountsInfo implements Serializable {
    private Integer total;
    private Integer available;
    private String status;
}