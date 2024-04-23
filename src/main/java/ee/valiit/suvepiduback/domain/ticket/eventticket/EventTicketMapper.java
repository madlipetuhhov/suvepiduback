package ee.valiit.suvepiduback.domain.ticket.eventticket;

import ee.valiit.suvepiduback.summerevent.Status;
import ee.valiit.suvepiduback.summerevent.ticket.dto.EventTicketInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EventTicketMapper {

    @Mapping(source = "total", target = "total")
    @Mapping(source = "available", target = "available")
    @Mapping(constant = Status.ACTIVE, target = "status")
    EventTicket toEventTicket(EventTicketInfo eventTicketInfo);

    @Mapping(source = "total", target = "total")
    @Mapping(source = "available", target = "available")
    @Mapping(source = "status", target = "status")
    EventTicketInfo toEventTicketInfo(EventTicket eventTicket);

}