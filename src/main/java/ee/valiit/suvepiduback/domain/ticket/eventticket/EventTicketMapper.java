package ee.valiit.suvepiduback.domain.ticket.eventticket;

import ee.valiit.suvepiduback.summerevent.ticket.dto.TicketAmountsInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventTicketMapper {
    EventTicket toEntity(TicketAmountsInfo ticketAmounts);

    TicketAmountsInfo toDto(EventTicket eventTicket);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    EventTicket partialUpdate(TicketAmountsInfo ticketAmounts, @MappingTarget EventTicket eventTicket);
}