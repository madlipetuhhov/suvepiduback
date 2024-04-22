package ee.valiit.suvepiduback.summerevent.mainevent;

import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfo;
import ee.valiit.suvepiduback.summerevent.mainevent.dto.MainEventInfoExtended;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class MainEventController {
    private final MainEventService mainEventService;

    @PostMapping("/event/main")
    @Operation(summary = "Uue sündmuse lisamine. Tagastab mainEventId ",
            description = "Süsteemi lisatakse uus sündmus koos title, description ja imageData'ga.")
    public Integer addNewMainEvent(@RequestBody MainEventInfo mainEventInfo) {
        // siin nt NewMainEventInfo DTO ilma ID-ta
        return mainEventService.addNewMainEvent(mainEventInfo);
    }

    // siin tagastad DTO objekti, millel on ID küljes
    @GetMapping("/event/main")
    @Operation(summary = "Ühe sündmuse toomine andmebaasist.",
            description = "Andmebaasist tuuakse üks sündmus mainEventId abil.")
    public MainEventInfoExtended getMainEvent(@RequestParam Integer mainEventId) {
        // get MainEventInfo object by ID
        // add new method in service to get data
        // in mainEventService.getMainEvent add relevant repository code
        return mainEventService.getMainEvent(mainEventId);
    }

    // siin tagastad DTO objekti listi objektidest, millel on ID-d küljes
    @GetMapping("/events/main")
    @Operation(summary = "Kõikide sündmuste toomine andmebaasist vastava ettevõtte kohta.",
            description = "Andmebaasist tuuakse vastava ettevõtte kõik sündmused businessId abil.")
    public List<MainEventInfoExtended> getMainEvents(@RequestParam Integer businessId) {
        // get list of MainEventInfo objects by business ID to only show relevant events
        // add new method in service to get data
        // in mainEventService.getMainEvents add relevant repository code
        return mainEventService.getMainEvents(businessId);
    }
//
//    // siin tagastad uuendatud DTO objekti , millel on ID küljes
//    @PutMapping("/event/main")
//    public MainEventInfo updateMainEvent(@RequestBody MainEventInfo mainEventInfo) {
//        // siin nt UpdateMainEventInfo DTO koos ID-ga
//        // update MainEventInfo object
//        // add new method in service to update data
//        // in mainEventService.updateMainEvent add relevant repository code
//        return mainEventService.updateMainEvent(mainEventInfo);
//    }
//
//    // siin tagastad kustutatud objekti ID, aga ainult selleks, et kontrollida frontendis kas see õnnestus
//    @DeleteMapping("/event/main")
//    public Integer deleteMainEvent(@RequestParam Integer eventId) {
//        // delete MainEventInfo by ID
//        // add new method in service to delete data
//        // in mainEventService.deleteMainEvent add relevant repository code
//        return mainEventService.deleteMainEvent(eventId);
//    }
}
