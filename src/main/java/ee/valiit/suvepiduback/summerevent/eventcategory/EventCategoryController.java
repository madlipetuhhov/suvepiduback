package ee.valiit.suvepiduback.summerevent.eventcategory;

import ee.valiit.suvepiduback.summerevent.eventcategory.dto.EventCategoryInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class EventCategoryController {
    private final EventCategoryService eventCategoryService;
    @PostMapping("/event/category?mainEventId={mainEventId}")
    @Operation(summary = "Uuele sündmusele kategooriate lisamine. Tagastab mainEventId??. ",
            description = "Süsteemi lisatakse sündmusele juurde kategooriad mainEventId abil.")
    public void addNewCategory(@RequestBody EventCategoryInfo eventCategoryInfo) {
        eventCategoryService.addNewCategory(eventCategoryInfo);
    }

}
