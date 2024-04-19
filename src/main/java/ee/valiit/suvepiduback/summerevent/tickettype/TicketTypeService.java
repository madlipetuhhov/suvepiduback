package ee.valiit.suvepiduback.summerevent.tickettype;

import ee.valiit.suvepiduback.domain.event.mainevent.MainEvent;
import ee.valiit.suvepiduback.domain.event.mainevent.MainEventRepository;
import ee.valiit.suvepiduback.domain.ticket.tickettype.TicketType;
import ee.valiit.suvepiduback.domain.ticket.tickettype.TicketTypeMapper;
import ee.valiit.suvepiduback.domain.ticket.tickettype.TicketTypeRepository;
import ee.valiit.suvepiduback.summerevent.tickettype.dto.TicketTypeInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class TicketTypeService {
    private final MainEventRepository mainEventRepository;
    private final TicketTypeRepository ticketTypeRepository;

    private final TicketTypeMapper ticketTypeMapper;

    public void addNewTicketTypes(Integer mainEventId, TicketTypeInfo ticketTypeInfo) {
        MainEvent mainEvent = mainEventRepository.getReferenceById(mainEventId);
        TicketType ticketType = ticketTypeMapper.toTicketType(ticketTypeInfo);
        ticketType.setMainEvent(mainEvent);
        ticketTypeRepository.save(ticketType);
    }


//    For loop näidis igaks juhuks alles jäetud. Siin ei läinud vaja, sest ticket type sisestame ükshaaval.
//    public void addNewTicketTypes(Integer mainEventId, List<TicketTypeInfo> ticketTypeInfos) {
//        MainEvent mainEvent = mainEventRepository.getReferenceById(mainEventId);
//        createAndSaveTicketTypes(mainEvent, ticketTypeInfos);
//    }
//
//    private void createAndSaveTicketTypes (MainEvent mainEvent, List<TicketTypeInfo> ticketTypeInfos) {
//        List<TicketType> ticketTypes = createTicketTypes(ticketTypeInfos, mainEvent);
//        ticketTypeRepository.saveAll(ticketTypes);
//    }
//
//    private List<TicketType> createTicketTypes(List<TicketTypeInfo> ticketTypeInfos, MainEvent mainEvent) {
//        List<TicketType> ticketTypes = new ArrayList<>();
//        for (TicketTypeInfo ticketTypeInfo : ticketTypeInfos){
//            TicketType ticketType = new TicketType();
//            ticketType.setMainEvent(mainEvent);
//            ticketType.setName(ticketTypeInfo.getTicketTypeName());
//            ticketType.setPrice(ticketTypeInfo.getTicketTypePrice());
//            ticketTypes.add(ticketType);
//        }
//        return ticketTypes;
//    }


}
