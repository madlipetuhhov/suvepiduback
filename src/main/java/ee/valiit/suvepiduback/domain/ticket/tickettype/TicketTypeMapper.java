package ee.valiit.suvepiduback.domain.ticket.tickettype;

import ee.valiit.suvepiduback.summerevent.tickettype.dto.TicketTypeInfo;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TicketTypeMapper {

    @Mapping(source = "ticketTypeName", target = "name")
    @Mapping(source = "ticketTypePrice", target = "price")
    TicketType toTicketType(TicketTypeInfo ticketTypeInfo);

}