package ee.valiit.suvepiduback.summerevent.tickettype;

import ee.valiit.suvepiduback.summerevent.tickettype.dto.TicketTypeInfo;
import ee.valiit.suvepiduback.summerevent.tickettype.dto.TicketTypeInfoExtended;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TicketTypeController {
    private final TicketTypeService ticketTypeService;

    @PostMapping("ticket-type")
    @Operation(summary = "Uuele sündmusele piletitüübi ja selle hinna lisamine. Tagastab mainEventId. ",
            description = "Süsteemi lisatakse sündmusele juurde piletitüübid ja nende hinnad mainEventId abil.")
    public Integer addNewTicketTypes(@RequestParam Integer mainEventId, @RequestBody TicketTypeInfo ticketTypeInfo) {
        return ticketTypeService.addNewTicketTypes(mainEventId, ticketTypeInfo);
    }

    @GetMapping("ticket-type")
    @Operation(summary = "Ühe pileti tüübi toomine andmebaasist.",
            description = "Andmebaasist tuuakse üks pileti tüüp mainEventId abil.")
    public TicketTypeInfoExtended getTicketType(@RequestParam Integer mainEventId) {
        return ticketTypeService.getTicketType(mainEventId);
    }

    @GetMapping("ticket-types")
    @Operation(summary = "Kõikide pileti tüüpide andmebaasist toomine vastava sündmuse kohta.",
            description = "Andmebaasist tuuakse vastava sündmuse kõik piletitüübid mainEventId abil.")
    public List<TicketTypeInfoExtended> getTicketTypes(@RequestParam Integer mainEventId) {
        return ticketTypeService.getTicketTypes(mainEventId);
    }

    @PutMapping("ticket-type")
    @Operation(summary = "Olemasoleva pileti tüübi andmete muutmine ticketTypeId (query parameetrina) abil.",
            description = "Andmebaasis kirjutatakse üle olemasoleva pileti tüübi andmed.")
    public void updateTicketType(@RequestParam Integer ticketTypeId, @RequestBody TicketTypeInfoExtended ticketTypeInfoExtended) {
        ticketTypeService.updateTicketType(ticketTypeId, ticketTypeInfoExtended);
    }

//    Delete meetodit ei saa teha pileti tüübile, sest andmebaasis pole staatust.
//    @DeleteMapping("ticket-type")
//    @Operation(summary = "Olemasoleva pileti tüübi eemaldamine ticketTypeId abil.",
//            description = "Andmebaasist reaalselt pileti tüüpi ei eemaldata, vaid deaktiveeritakse.")
//    public Integer removeTicketType(@RequestParam Integer ticketTypeId) {
//        return ticketTypeService.removeTicketType(ticketTypeId);
//    }


}
